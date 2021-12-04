package by.bsuir.wt.lab2.entity;


import java.io.Serializable;
/**
 * Frige entity class
 *
 * @author KhromovVladinir
 *
 */
public class Refrigerator extends Appliance implements Serializable {

    /**
     * ID for binary serialization
     */
    private static final long serialVersionUID = -3865159360425404963L;
    /**
     * frige power consumption in Watts
     */
    private double powerConsumption;
    /**
     * frige weight in kilograms
     */
    private double weight;
    /**
     * frige's freezer capacity in liters
     */
    private double freezerCapacity;
    /**
     * frige's total capacity in liters
     */
    private double overallCapacity;
    /**
     * frige height in centimeters
     */
    private double height;
    /**
     * frige width in centimeters
     */
    private double width;

    /**
     * creates frige entity object without params
     */
    public Refrigerator() {

    }

    /**
     *
     * Creates oven entity object with the specified params
     *
     * @param price            - price of the frige
     * @param powerConsumption - frige power consumption in Watts
     * @param weight           - frige weight in kilograms
     * @param freezerCapacity  - frige's freezer capacity in liters
     * @param overallCapacity- frige's total capacity in liters
     * @param height           - frige height in centimeters
     * @param width            - frige width in centimeters
     */
    public Refrigerator(double price, double powerConsumption, double weight, double freezerCapacity,
                        double overallCapacity, double height, double width) {
        super.price = price;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 && Double.compare(that.price, price) == 0
                && Double.compare(that.weight, weight) == 0
                && Double.compare(that.freezerCapacity, freezerCapacity) == 0
                && Double.compare(that.overallCapacity, overallCapacity) == 0
                && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (31 * price + 29 * powerConsumption + 23 * weight + 19 * freezerCapacity + 13 * overallCapacity
                + 7 * height + 5 * width);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "price=" + price + ", powerConsumption=" + powerConsumption
                + ", weight=" + weight + ", freezerCapacity=" + freezerCapacity + ", overallCapacity=" + overallCapacity
                + ", height=" + height + ", width=" + width + '}';
    }
}