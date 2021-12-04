package by.bsuir.wt.lab2.dao.control.impl;


import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.entity.Laptop;
/**
 * Controller to manipulate laptop entity object's fields
 *
 * @author KhromovVladinir
 *
 */
public class LaptopController implements Controller {

    /**
     * Controlled laptop entity object
     */
    private Laptop laptop;

    /**
     * Constructor for controller of laptop
     *
     * @param laptop - entity object to be controlled
     */
    public LaptopController(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String takeInfo() {
        return this.laptop.toString();
    }

    @Override
    public boolean containsValue(String key, Object value) {
        boolean answer = true;
        switch (key) {
            case "PRICE":
                if (!(laptop.getPrice() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "BATTERY_CAPACITY":
                if (!(laptop.getBatteryCapacity() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "OS":
                if (!(laptop.getOperationSystem().equals(value.toString()))) {
                    answer = false;
                }
                break;
            case "MEMORY_ROM":
                if (!(laptop.getMemoryROM() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "SYSTEM_MEMORY":
                if (!(laptop.getSystemMemory() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "CPU":
                if (!(laptop.getCpu() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "DISPLAY_INCHS":
                if (!(laptop.getDisplayInchs() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;

            default:
                answer = false;
        }
        return answer;
    }

}