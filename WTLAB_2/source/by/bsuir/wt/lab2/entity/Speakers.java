package by.bsuir.wt.lab2.entity;

import java.io.Serializable;
import java.util.Objects;

/**
         * @author KhromovVladinir
        *
        */
public class Speakers extends Appliance implements Serializable {
    /**
     * ID for binary serialization
     */
    private static final long serialVersionUID = -4604680901596335470L;
    /**
     * speakers power consumption in Watts
     */
    private double powerConsumption;
    /**
     * number of speakers
     */
    private int numberOfSpeakers;
    /**
     * speakers frequency range from min Herz to max kHerz
     */
    private String frequency;
    /**
     * speakers cord length in meters
     */
    private double cordLength;

    /**
     * creates speakers entity object without params
     */
    public Speakers(){

    }

    /**
     * Creates speakers entity object with the specified params
     * @param price  - price of the speakers
     * @param powerConsumption - speakers power consumption in Watts
     * @param numberOfSpeakers - number of speakers
     * @param frequency - speakers frequency range from min Herz to max kHerz
     * @param cordLength - speakers cord length in meters
     */
    public Speakers(double price, double powerConsumption, int numberOfSpeakers, String frequency, double cordLength) {
        super.price=price;
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequency = frequency;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0
                && Double.compare(speakers.price, price) == 0
                && numberOfSpeakers == speakers.numberOfSpeakers
                && Double.compare(speakers.cordLength, cordLength) == 0
                && frequency.equals(speakers.frequency);
    }

    @Override
    public int hashCode() {
        return (int)(31*price+29*powerConsumption+23*numberOfSpeakers+Objects.hashCode(frequency)+13*cordLength);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequency='" + frequency +
                ", cordLength=" + cordLength +
                ", price=" + price +
                '}';
    }
}