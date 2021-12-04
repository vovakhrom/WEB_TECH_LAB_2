package by.bsuir.wt.lab2.entity;

/**
 * Abstract appliance entity class to be extended with other appliance entities' classes
 * @author KhromovVladinir
 *
 */
public abstract class Appliance {
    /**
     * price of the appliance
     */
    protected double price;

    /**
     * Gets appliance price
     * @return price of the appliance
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets appliance price
     * @param price - value to be set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}