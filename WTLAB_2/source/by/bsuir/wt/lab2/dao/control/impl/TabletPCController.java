package by.bsuir.wt.lab2.dao.control.impl;

import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.entity.TabletPC;


/**
 * Controller to manipulate tabletPC entity object's fields
 *
 * @author KhromovVladinir
 *
 */
public class TabletPCController implements Controller {
    /**
     * Controlled tabletPC entity object
     */
    private TabletPC tabletPC;

    /**
     * Constructor for controller of tabletPC
     *
     * @param tabletPC - entity object to be controlled
     */
    public TabletPCController(TabletPC tabletPC) {
        this.tabletPC = tabletPC;
    }

    @Override
    public String takeInfo() {
        return this.tabletPC.toString();
    }

    @Override
    public boolean containsValue(String key, Object value) {
        boolean answer = true;
        switch (key) {
            case "PRICE":
                if (!(tabletPC.getPrice() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "BATTERY_CAPACITY":
                if (!(tabletPC.getBatteryCapacity() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "DISPLAY_INCHES":
                if (!(tabletPC.getDisplayInches() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "MEMORY_ROM":
                if (!(tabletPC.getMemoryROM() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "FLASH_MEMORY_CAPACITY":
                if (!(tabletPC.getFlashMemoryCapacity() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "COLOR":
                if (!(tabletPC.getColor().equals(value.toString()))) {
                    answer = false;
                }
                break;

            default:
                answer = false;
        }
        return answer;
    }
}