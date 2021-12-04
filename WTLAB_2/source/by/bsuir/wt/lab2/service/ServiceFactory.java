package by.bsuir.wt.lab2.service;

import by.bsuir.wt.lab2.service.impl.ApplianceServiceImpl;

/**
 * Factory class for appliance entities services
 *
 * @author KhromovVladinir
 *
 */
public final class ServiceFactory {
    /**
     * single factory instance for all the application
     */
    private static final ServiceFactory instance = new ServiceFactory();
    /**
     * Appliance entities service object
     */
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    /**
     * constructor unavailable from out of class
     */
    private ServiceFactory() {
    }

    /**
     * Factory method for appliance service
     *
     * @return ApplianceService - object of appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Static factory instance returning method instead of constructor
     *
     * @return single factory instance for all the application
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}