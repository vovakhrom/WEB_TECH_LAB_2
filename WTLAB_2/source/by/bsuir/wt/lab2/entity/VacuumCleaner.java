package by.bsuir.wt.lab2.entity;

import java.io.Serializable;
import java.util.Objects;


/**
 * Vacuum cleaner entity class
 *
 * @author
 *
 */
public class VacuumCleaner extends Appliance implements Serializable {
    /**
     * ID for binary serialization
     */
    private static final long serialVersionUID = 2316757517912009060L;
    /**
     * Vacuum cleaner power consumption in Watts
     */
    private double powerConsumption;
    /**
     * Vacuum cleaner filter type name
     */
    private String filterType;
    /**
     * Vacuum cleaner bag type name
     */
    private String bagType;
    /**
     * Vacuum cleaner wand type name
     */
    private String wandType;
    /**
     * Vacuum cleaner motor rotation speed in routes per minute
     */
    private double motorSpeedRegulation;
    /**
     * Vacuum cleaner cleaning width in centimeters
     */
    private double cleaningWidth;

    /**
     * creates vacuum cleaner entity object without params
     */
    public VacuumCleaner(){

    }

    /**
     * Creates vacuum cleaner entity object with the specified params
     * @param price - price of the vacuum cleaner
     * @param powerConsumption - vacuum cleaner power consumption in Watts
     * @param filterType - vacuum cleaner filter type name
     * @param bagType - vacuum cleaner bag type name
     * @param wandType - vacuum cleaner wand type name
     * @param motorSpeedRegulation - vacuum cleaner motor rotation speed in routes per minute
     * @param cleaningWidth - vacuum cleaner cleaning width in centimeters
     */
    public VacuumCleaner(double price, double powerConsumption, String filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        super.price=price;
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.price, price) == 0
                && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Double.compare(that.cleaningWidth, cleaningWidth) == 0
                && filterType.equals(that.filterType)
                && bagType.equals(that.bagType)
                && wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        return (int)(31*price+29*powerConsumption+Objects.hash(filterType,bagType,wandType)
                +23*motorSpeedRegulation+13*cleaningWidth);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", filterType='" + filterType  +
                ", bagType='" + bagType +
                ", wandType='" + wandType +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}