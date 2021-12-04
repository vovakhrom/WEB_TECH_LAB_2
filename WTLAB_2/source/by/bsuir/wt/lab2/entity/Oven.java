package by.bsuir.wt.lab2.entity;


import java.io.Serializable;

/**
 * Oven entity class
 *
 * @author KhromovVladinir
 *
 */
public class Oven extends Appliance implements Serializable {

    /**
     * ID for binary serialization
     */
    private static final long serialVersionUID = 6945777064141296704L;
    /**
     * oven power consumption in Watts
     */
    private double powerConsumption;
    /**
     * oven weight in kilograms
     */
    private double weight;
    /**
     * oven capacity in liters
     */
    private double capacity;
    /**
     * oven depth in centimeters
     */
    private double depth;
    /**
     * oven height in centimeters
     */
    private double height;
    /**
     * oven width in centimeters
     */
    private double width;

    /**
     * creates oven entity object without params
     */
    public Oven() {

    }

    /**
     * Creates oven entity object with the specified params
     *
     * @param price            - price of the oven
     * @param powerConsumption - oven power consumption in Watts
     * @param weight           - oven weight in kilograms
     * @param capacity         - oven capacity in liters
     * @param depth            - oven depth in centimeters
     * @param heiht            - oven height in centimeters
     * @param width            - oven width in centimeters
     */
    public Oven(double price, double powerConsumption, double weight, double capacity, double depth, double heiht,
                double width) {
        super.price = price;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = heiht;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
    public String toString() {
        return getClass().getSimpleName() + "{" + "price=" + price + ", powerConsumption=" + powerConsumption
                + ", weight=" + weight + ", capacity=" + capacity + ", depth=" + depth + ", height=" + height
                + ", width=" + width + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0 && Double.compare(oven.price, price) == 0
                && Double.compare(oven.weight, weight) == 0 && Double.compare(oven.capacity, capacity) == 0
                && Double.compare(oven.depth, depth) == 0 && Double.compare(oven.height, height) == 0
                && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (31 * price + 29 * powerConsumption + 13 * weight + 7 * capacity + 5 * depth + 3 * height + width);
    }
}