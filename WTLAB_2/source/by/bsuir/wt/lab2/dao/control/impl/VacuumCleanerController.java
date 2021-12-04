package by.bsuir.wt.lab2.dao.control.impl;

import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.entity.VacuumCleaner;
/**
 * Controller to manipulate vacuum cleaner entity object's fields
 *
 * @author KhromovVladinir
 *
 */
public class VacuumCleanerController implements Controller {
    /**
     * Controlled vacuum cleaner entity object
     */
    private VacuumCleaner vacuumCleaner;

    /**
     * Constructor for controller of vacuum cleaner
     *
     * @param vacuumCleaner - entity object to be controlled
     */
    public VacuumCleanerController(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    @Override
    public String takeInfo() {
        return this.vacuumCleaner.toString();
    }

    @Override
    public boolean containsValue(String key, Object value) {
        boolean answer = true;
        switch (key) {
            case "PRICE":
                if (!(vacuumCleaner.getPrice() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "POWER_CONSUMPTION":
                if (!(vacuumCleaner.getPowerConsumption() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "FILTER_TYPE":
                if (!(vacuumCleaner.getFilterType().equals(value.toString()))) {
                    answer = false;
                }
                break;
            case "BAG_TYPE":
                if (!(vacuumCleaner.getBagType().equals(value.toString()))) {
                    answer = false;
                }
                break;
            case "WAND_TYPE":
                if (!(vacuumCleaner.getWandType().equals(value.toString()))) {
                    answer = false;
                }
                break;
            case "MOTOR_SPEED_REGULATION":
                if (!(vacuumCleaner.getMotorSpeedRegulation() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;
            case "CLEANING_WIDTH":
                if (!(vacuumCleaner.getCleaningWidth() == Double.parseDouble(value.toString()))) {
                    answer = false;
                }
                break;

            default:
                answer = false;
        }
        return answer;
    }
}