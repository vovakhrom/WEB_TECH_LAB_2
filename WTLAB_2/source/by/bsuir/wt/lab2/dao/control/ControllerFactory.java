package by.bsuir.wt.lab2.dao.control;

import by.bsuir.wt.lab2.entity.*;
import by.bsuir.wt.lab2.dao.control.impl.*;
/**
 * Factory class for controllers of appliance entities
 * @author KhromovVladinir
 *
 */
public final class ControllerFactory {

    private static final ControllerFactory instance = new ControllerFactory();

    private ControllerFactory() {
    }

    /**
     * Static factory instance returning method instead of constructor
     *
     * @return single factory instance for all the application
     */
    public static ControllerFactory getInstance() {
        return instance;
    }

    /**
     * Defines and creates required controller for appliance entity object
     * @param appliance - appliance entity object to provide controller for
     * @return new controller for appliance
     */
    public Controller takeApplianceConrtoller(Appliance appliance) {

        if (appliance.getClass() == Oven.class) {
            return new OvenController((Oven) appliance);
        }
        if (appliance.getClass() == Laptop.class) {
            return new LaptopController((Laptop) appliance);
        }
        if (appliance.getClass() == Refrigerator.class) {
            return new RefrigeratorController((Refrigerator) appliance);
        }
        if (appliance.getClass() == Speakers.class) {
            return new SpeakersController((Speakers) appliance);
        }
        if (appliance.getClass() == TabletPC.class) {
            return new TabletPCController((TabletPC) appliance);
        }
        if (appliance.getClass() == VacuumCleaner.class) {
            return new VacuumCleanerController((VacuumCleaner) appliance);
        }
        return null;
    }

}