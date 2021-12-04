package by.bsuir.wt.lab2.dao.impl;
import by.bsuir.wt.lab2.dao.parser.Parser;
import by.bsuir.wt.lab2.dao.parser.XMLParser;
import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.dao.ApplianceDAO;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import by.bsuir.wt.lab2.dao.parser.Parser.*;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
/**
 * Data access object class to appliance entities
 * @author KhromovVladinir
 *
 */
public class ApplianceDAOImpl implements ApplianceDAO{

    @Override
    public List<Appliance> find(Criteria criteria) {
        Parser parser=new XMLParser();
        try {
            parser.parse("src/main/resources/file.xml");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return parser.take(criteria);
    }


}