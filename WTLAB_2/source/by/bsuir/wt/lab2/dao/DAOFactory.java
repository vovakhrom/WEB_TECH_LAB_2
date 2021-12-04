package by.bsuir.wt.lab2.dao;

import by.bsuir.wt.lab2.dao.impl.ApplianceDAOImpl;

/**
 * Factory class for data access objects to appliance entities
 *
 * @author KhromovVladinir
 *
 */
public final class DAOFactory {
    /**
     * single factory instance for all the application
     */
    private static final DAOFactory instance = new DAOFactory();
    /**
     * DAO to appliance entities
     */
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    /**
     * constructor unavailable from out of class
     */
    private DAOFactory() {
    }

    /**
     * Factory method for DAO
     *
     * @return ApplianceDAO - DAO to appliance entities
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Static factory instance returning method instead of constructor
     *
     * @return single factory instance for all the application
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}