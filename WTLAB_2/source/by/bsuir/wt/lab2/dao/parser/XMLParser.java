package by.bsuir.wt.lab2.dao.parser;

import by.bsuir.wt.lab2.entity.*;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.dao.control.ControllerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * XML files parser class getting info about appliance entities
 * @author Radon-Rodion (aka Pavel Rafeyev)
 *
 */
public class XMLParser implements Parser {
    /**
     * list of appliances parsed from file
     */
    private  ArrayList<Appliance> appliances = new ArrayList<>();

    @Override
    public void parse(String path) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();


        XMLHandler handler = new XMLHandler();
        parser.parse(new File(path), handler);
    }

    @Override
    public List<Appliance> take(Criteria criteria) {
        List<Appliance> listToReturn=new ArrayList<>();

        Set<String> keys=criteria.getKeysSet();

        ControllerFactory controllerFactory=ControllerFactory.getInstance();

        if(criteria.getGroupSearchName().isEmpty()){
            listToReturn.addAll(appliances);
            return listToReturn;
        }

        for (int i = 0; i <appliances.size(); i++) {

            Controller controller=controllerFactory.takeApplianceConrtoller(appliances.get(i));

            if(criteria.getGroupSearchName().equals(appliances.get(i).getClass().getSimpleName())){

                Iterator<String> iterator=keys.iterator();
                boolean isValid=true;
                while (iterator.hasNext()){
                    String key=iterator.next();
                    if(!(controller.containsValue(key,criteria.get(key)))){
                        isValid=false;
                        break;
                    }
                }
                if(isValid){
                    listToReturn.add(appliances.get(i));
                }
            }

        }
        return listToReturn;
    }

    /**
     * SAX events handler specified for parsing XML files with appliances info
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    private  class XMLHandler extends DefaultHandler {

        /**
         * Receives notification of the start of an element
         * Defines element's class (class of an appliance), sets its fields according to the attributes
         * and adds it to the appliances list
         */
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("oven")) {
                double price = Double.parseDouble(attributes.getValue("price"));
                double powerConsumption = Double.parseDouble(attributes.getValue("power-consumption"));
                double weight = Double.parseDouble(attributes.getValue("weight"));
                double capacity = Double.parseDouble(attributes.getValue("capacity"));
                double depth = Double.parseDouble(attributes.getValue("depth"));
                double height = Double.parseDouble(attributes.getValue("height"));
                double width = Double.parseDouble(attributes.getValue("width"));

                appliances.add(new Oven(price,powerConsumption, weight,capacity,depth,height,width));
            }


            if (qName.equals("laptop")) {
                double price = Double.parseDouble(attributes.getValue("price"));
                String os=attributes.getValue("os");
                double batteryCapacity = Double.parseDouble(attributes.getValue("battery-capacity"));
                double memoryRom = Double.parseDouble(attributes.getValue("memory-rom"));
                double systemMemory = Double.parseDouble(attributes.getValue("system-memory"));
                double cpu = Double.parseDouble(attributes.getValue("cpu"));
                double displayInchs = Double.parseDouble(attributes.getValue("display-inchs"));

                appliances.add(new Laptop(price,batteryCapacity,os,memoryRom,systemMemory,cpu,displayInchs));
            }

            if (qName.equals("refrigerator")) {
                double price = Double.parseDouble(attributes.getValue("price"));
                double powerConsumption = Double.parseDouble(attributes.getValue("power-consumption"));
                double weight = Double.parseDouble(attributes.getValue("weight"));
                double freezerCapacity = Double.parseDouble(attributes.getValue("freezer-capacity"));
                double overallCapacity = Double.parseDouble(attributes.getValue("overall-capacity"));
                double height = Double.parseDouble(attributes.getValue("height"));
                double width = Double.parseDouble(attributes.getValue("width"));

                appliances.add(new Refrigerator(price,powerConsumption, weight,freezerCapacity,overallCapacity,height,width));
            }

            if (qName.equals("speaker")) {
                double price = Double.parseDouble(attributes.getValue("price"));
                double powerConsumption = Double.parseDouble(attributes.getValue("power-consumption"));
                int numberOfSpeakers = Integer.parseInt(attributes.getValue("number-of-speakers"));
                String frequencyRange = attributes.getValue("frequency-range");
                double cordLength = Double.parseDouble(attributes.getValue("cord-length"));

                appliances.add(new Speakers(price,powerConsumption, numberOfSpeakers,frequencyRange,cordLength));
            }

            if (qName.equals("tablet-pc")) {
                double price = Double.parseDouble(attributes.getValue("price"));
                double batteryCapacity = Double.parseDouble(attributes.getValue("battery-capacity"));
                double displayInches = Double.parseDouble(attributes.getValue("display-inches"));
                double memoryRom = Double.parseDouble(attributes.getValue("memory-rom"));
                double flashMemoryCapacity = Double.parseDouble(attributes.getValue("flash-memory-capacity"));
                String color = attributes.getValue("color");


                appliances.add(new TabletPC(price,batteryCapacity,displayInches,memoryRom,flashMemoryCapacity,color));
            }

            if (qName.equals("vacuum-cleaner")) {
                double price = Double.parseDouble(attributes.getValue("price"));
                double powerConsumption = Double.parseDouble(attributes.getValue("power-consumption"));
                String filterType = attributes.getValue("filter-type");
                String bagType = attributes.getValue("bag-type");
                String wandType = attributes.getValue("wand-type");
                double motorSpeedRegulation = Double.parseDouble(attributes.getValue("motor-speed-regulation"));
                double cleaningWidth = Double.parseDouble(attributes.getValue("cleaning-width"));

                appliances.add(new VacuumCleaner(price,powerConsumption,filterType,bagType,wandType,motorSpeedRegulation,cleaningWidth));
            }

        }


    }
}