package by.bsuir.wt.lab2.entity.criteria;

/**
 * Class keeping enums of field names for appliance entities filtration
 * @author KhromovVladinir
 *
 */
public final class SearchCriteria {
    /**
     * field names for oven entities filtration
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    public static enum Oven{
        PRICE,POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }
    /**
     * field names for oven entities filtration
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    public static enum Laptop{
        PRICE,BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
    }
    /**
     * field names for laptop entities filtration
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    public static enum Refrigerator{
        PRICE,POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
    }
    /**
     * field names for frige entities filtration
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    public static enum VacuumCleaner{
        PRICE,POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
    }
    /**
     * field names for tabletPC entities filtration
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    public static enum TabletPC{
        PRICE,BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }
    /**
     * field names for speakers entities filtration
     * @author Radon-Rodion (aka Pavel Rafeyev)
     *
     */
    public static enum Speakers{
        PRICE,POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
    }


    private SearchCriteria() {}
}
