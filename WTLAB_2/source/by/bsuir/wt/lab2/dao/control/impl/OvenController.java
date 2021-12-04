package by.bsuir.wt.lab2.dao.control.impl;


import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.entity.Oven;
/**
 * Oven controller to manipulate oven entity object's fields
 *
 * @author KhromovVladinir
 *
 */
public class OvenController implements Controller {
    /**
     * Controlled oven entity object
     */
    private Oven oven;

    /**
     * Constructor for controller of oven
     *
     * @param oven - entity object to be controlled
     */
    public OvenController(Oven oven) {
        this.oven = oven;
    }

    @Override
    public String takeInfo() {
        return this.oven.toString();
    }

    @Override
    public boolean containsValue(String key, Object value) {
        boolean answer = true;
        switch (key) {
            case "PRICE":
                if (!(oven.getPrice() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "POWER_CONSUMPTION":
                if (!(oven.getPowerConsumption() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "WEIGHT":
                if (!(oven.getWeight() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "CAPACITY":
                if (!(oven.getCapacity() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "DEPTH":
                if (!(oven.getDepth() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "HEIGHT":
                if (!(oven.getHeight() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "WIDTH":
                if (!(oven.getWidth() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;

            default:
                answer = false;
        }
        return answer;
    }
}