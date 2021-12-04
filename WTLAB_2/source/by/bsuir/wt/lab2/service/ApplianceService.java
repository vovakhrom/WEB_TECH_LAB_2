package by.bsuir.wt.lab2.service;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface of appliance service
 *
 * @author KhromovVladinir
 *
 */
public interface ApplianceService {
    /**
     * Filters appliances according to criteria
     * @param criteria - object with parameters for filtration
     * @return list of appliance entities objects fitting criteria params
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Finds cheapest appliance of groupName type
     * @param groupName - type of appliances
     * @return cheapest appliance of the type
     */
    Appliance findCheapest(String groupName);
}