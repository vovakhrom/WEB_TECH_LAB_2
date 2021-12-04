package by.bsuir.wt.lab2.dao;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;


import java.util.List;
/**
 * Interface for data access objects to appliance entities
 * @author KhromovVladinir
 *
 */
public interface ApplianceDAO {
    /**
     * Searches and filters appliance entity object by params of criteria
     * @param criteria - object with params to filter
     * @return list of found entities or null if nothing is found
     */
    List<Appliance> find(Criteria criteria);
}