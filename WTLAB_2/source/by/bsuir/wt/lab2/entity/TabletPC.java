package by.bsuir.wt.lab2.entity;


import java.io.Serializable;
import java.util.Objects;

/**
 * TabletPC entity class
 *
 * @author KhromovVladinir
 *
 */
public class TabletPC extends Appliance implements Serializable {

    /**
     * ID for binary serialization
     */
    private static final long serialVersionUID = -4935674128255574286L;
    /**
     * capacity of the tabletPC's battery in Amper-hours
     */
    private double batteryCapacity;
    /**
     * tabletPC's display diagonal length in inches
     */
    private double displayInches;
    /**
     * tabletPC's memory ROM in GBytes
     */
    private double memoryROM;
    /**
     * tabletPC's flash memory in GBytes
     */
    private double flashMemoryCapacity;
    /**
     * tabletPC's color (example: blue)
     */
    private String color;

    /**
     * Creates tabletPC's entity without params
     */
    public TabletPC() {

    }

    /**
     * Creates tabletPC's entity object with the specified params
     *
     * @param price               - price of the tabletPC
     * @param batteryCapacity     - capacity of the tabletPC's battery in
     *                            Amper-hours
     * @param displayInches       - tabletPC's display diagonal length in inches
     * @param memoryROM           - tabletPC's memory ROM in GBytes
     * @param flashMemoryCapacity - tabletPC's flash memory in GBytes
     * @param color               - tabletPC's color (example: blue)
     */
    public TabletPC(double price, double batteryCapacity, double displayInches, double memoryROM,
                    double flashMemoryCapacity, String color) {
        super.price = price;
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && Double.compare(tabletPC.price, price) == 0
                && Double.compare(tabletPC.displayInches, displayInches) == 0
                && Double.compare(tabletPC.memoryROM, memoryROM) == 0
                && Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
                && color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        return (int) (31 * price + 29 * batteryCapacity + 23 * displayInches + 13 * memoryROM + 7 * flashMemoryCapacity
                + Objects.hashCode(color));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "price=" + price + ", batteryCapacity=" + batteryCapacity
                + ", displayInches=" + displayInches + ", memoryROM=" + memoryROM + ", flashMemoryCapacity="
                + flashMemoryCapacity + ", color='" + color + '}';
    }
}