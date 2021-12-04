package by.bsuir.wt.lab2.main;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.dao.control.ControllerFactory;


/**
 * Class for printing fields of appliance entity object to console
 *
 * @author KhromovVladinir
 *
 */
public class PrintApplianceInfo {
    /**
     * Prints fields of appliance entity object to console
     * @param appliance - appliance entity object
     */
    public static void print(Appliance appliance) {
        ControllerFactory controllerFactory = ControllerFactory.getInstance();
        Controller controller = controllerFactory.takeApplianceConrtoller(appliance);
        System.out.println(controller.takeInfo());
    }
}