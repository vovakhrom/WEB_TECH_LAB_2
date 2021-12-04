package by.bsuir.wt.lab2.dao.control;

/**
 * Interface of appliance entities controller to manipulate appliance entity
 * object's fields
 *
 * @author Radon-Rodion (aka Pavel Rafeyev)
 *
 */
public interface Controller {
    /**
     * Takes string with all the information about appliance
     *
     * @return string with all the fields of application entity
     */
    public String takeInfo();

    /**
     * Defines if appliance entity object's field named 'key' has required value
     *
     * @param key   - field name
     * @param value - required field value
     * @return true if entity's key field equals value, false in other cases
     */
    public boolean containsValue(String key, Object value);
}