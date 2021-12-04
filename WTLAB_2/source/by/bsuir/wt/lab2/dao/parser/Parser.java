package by.bsuir.wt.lab2.dao.parser;
import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
/**
 * Interface of files parsers getting info about appliance entities
 * @author Radon-Rodion (aka Pavel Rafeyev)
 *
 */
public interface Parser {
    /**
     * Parses file with information about appliances
     * @param path - path to parsed file with information about appliances
     * @throws ParserConfigurationException if parser can not be created
     * @throws SAXException for SAX errors
     * @throws IOException if file can not be accessed
     */
    void parse(String path) throws ParserConfigurationException, SAXException, IOException;
    /**
     * Takes all the entity objects fitting criteria
     * @param criteria - params to filter entities
     * @return list of entity objects fiiting criteria
     */
    List<Appliance> take(Criteria criteria);
}