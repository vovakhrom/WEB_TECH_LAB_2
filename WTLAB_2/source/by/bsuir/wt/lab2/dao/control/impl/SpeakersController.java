package by.bsuir.wt.lab2.dao.control.impl;

import by.bsuir.wt.lab2.dao.control.Controller;
import by.bsuir.wt.lab2.entity.Speakers;
/**
 * Controller to manipulate speakers entity object's fields
 *
 * @author KhromovVladinir
 *
 */
public class SpeakersController implements Controller {
    /**
     * Controlled speakers entity object
     */
    private Speakers speakers;

    /**
     * Constructor for controller of speakers
     *
     * @param speakers - entity object to be controlled
     */
    public SpeakersController(Speakers speakers) {
        this.speakers = speakers;
    }

    @Override
    public String takeInfo() {
        return this.speakers.toString();
    }

    @Override
    public boolean containsValue(String key, Object value) {
        boolean answer=true;
        switch (key){
            case "PRICE":
                if(!(speakers.getPrice()==Double.parseDouble(value.toString()))){
                    answer=false;
                }
                break;
            case "POWER_CONSUMPTION":
                if(!(speakers.getPowerConsumption()==Double.parseDouble(value.toString()))){
                    answer=false;
                }
                break;
            case "NUMBER_OF_SPEAKERS":
                if(!(speakers.getNumberOfSpeakers()==Integer.parseInt(value.toString()))){
                    answer=false;
                }
                break;
            case "FREQUENCY_RANGE":
                String[] mas1=value.toString().split("-");
                double n11=Double.parseDouble(mas1[0]);
                double n12=Double.parseDouble(mas1[1]);

                String[] mas2=speakers.getFrequency().split("-");
                double n21=Double.parseDouble(mas2[0]);
                double n22=Double.parseDouble(mas2[1]);

                if(!(n11==n21 && n22==n12)){
                    answer=false;
                }
                break;
            case "CORD_LENGTH":
                if(!(speakers.getCordLength()==Double.parseDouble(value.toString()))){
                    answer=false;
                }
                break;

            default:
                answer=false;
        }
        return answer;
    }
}