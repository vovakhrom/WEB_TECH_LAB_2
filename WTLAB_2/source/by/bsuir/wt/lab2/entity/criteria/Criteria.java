package by.bsuir.wt.lab2.entity.criteria;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Class with params to filter appliance entities
 * @author KhromovVladinir
 *
 */
public class Criteria {
    /**
     * Appliance type (and entity class name)
     */
    private String groupSearchName;
    /**
     * map of fields names and values
     */
    private Map<String, Object> criteria = new HashMap<String, Object>();

    /**
     * Creates criteria for appliance type
     * @param groupSearchName - Appliance type (and entity class name)
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }


    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Adds new parameter (field) for filtration
     * @param searchCriteria - field name
     * @param value - field value
     */
    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    /**
     * Gets filtering criteria number of parameters
     * @return number of filtering parameters
     */
    public int criteriaSize(){
        return criteria.size();
    }

    /**
     * Gets filtering parameter value
     * @param key - filtering parameter (field) name
     * @return filtering parameter value
     */
    public Object get(String key){
        return criteria.get(key);
    }

    /**
     * Gets all the filtering parameters names set
     * @return set of filtering fileds names
     */
    public Set<String> getKeysSet(){
        return criteria.keySet();
    }

}