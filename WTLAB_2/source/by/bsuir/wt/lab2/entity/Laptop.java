package by.bsuir.wt.lab2.entity;


import java.io.Serializable;
import java.util.Objects;
/**
 * Laptop entity class
 *
 * @author KhromovVladinir
 *
 */
public class Laptop extends Appliance implements Serializable {
    /**
     * ID for binary serialization
     */
    private static final long serialVersionUID = 6964455301541586483L;
    /**
     * capacity of the laptop's battery in Amper-hours
     */
    private double batteryCapacity;
    /**
     * laptop's operation system name (null if no operation system)
     */
    private String operationSystem;
    /**
     * laptop's memory ROM in GBytes
     */
    private double memoryROM;
    /**
     * laptop's RAM in MBytes
     */
    private double systemMemory;
    /**
     * laptop's CPU in GHerz
     */
    private double cpu;
    /**
     * laptop's display diagonal length in inches
     */
    private double displayInchs;

    /**
     * Creates laptop entity without params
     */
    public Laptop() {

    }

    /**
     * Creates laptop entity object with the specified params
     *
     * @param price           - price of the laptop
     * @param batteryCapacity - capacity of the laptop's battery in Amper-hours
     * @param operationSystem - laptop's operation system name (null if no operation
     *                        system)
     * @param memoryROM       - laptop's memory ROM in GBytes
     * @param systemMemory    - laptop's RAM in MBytes
     * @param cpu             - laptop's CPU in GHerz
     * @param displayInchs    - laptop's display diagonal length in inches
     */
    public Laptop(double price, double batteryCapacity, String operationSystem, double memoryROM, double systemMemory,
                  double cpu, double displayInchs) {
        super.price = price;
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
                && Double.compare(laptop.memoryROM, memoryROM) == 0
                && Double.compare(laptop.systemMemory, systemMemory) == 0 && Double.compare(laptop.cpu, cpu) == 0
                && Double.compare(laptop.displayInchs, displayInchs) == 0
                && operationSystem.equals(laptop.operationSystem);
    }

    @Override
    public int hashCode() {
        return (int) (11 * price + 23 * batteryCapacity - Objects.hashCode(operationSystem) + 7 * memoryROM
                + 13 * systemMemory + 29 * cpu - 5 * displayInchs) ^ 0b110100011100100011010110001;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "price=" + price + ", batteryCapacity=" + batteryCapacity
                + ", operationSystem='" + operationSystem + ", memoryROM=" + memoryROM + ", systemMemory="
                + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + '}';
    }
}