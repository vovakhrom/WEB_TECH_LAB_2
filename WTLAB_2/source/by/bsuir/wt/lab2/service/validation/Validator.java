package by.bsuir.wt.lab2.service.validation;

import by.bsuir.wt.lab2.entity.criteria.Criteria;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Class for validation of criteria parameters
 *
 * @author KhromovVladinir
 *
 */
public class Validator {
    /**
     * Checks criteria for validation
     *
     * @param criteria - validated criteria object
     * @return true if criteria is valid, false in other cases
     */
    public static boolean criteriaValidator(Criteria criteria) {

        boolean isValid = true;
        Set<String> keys = criteria.getKeysSet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (!isValueValid(key, criteria.get(key))) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    /**
     * Checks criteria field for validation
     *
     * @param key   - field name
     * @param value - field value
     * @return true if criteria field is valid, false in other cases
     */
    private static boolean isValueValid(String key, Object value) {
        boolean answer;
        switch (key) {
            case "PRICE":
            case "POWER_CONSUMPTION":
            case "WEIGHT":
            case "CAPACITY":
            case "DEPTH":
            case "HEIGHT":
            case "WIDTH":
            case "BATTERY_CAPACITY":
            case "MEMORY_ROM":
            case "SYSTEM_MEMORY":
            case "CPU":
            case "DISPLAY_INCHS":
            case "FREEZER_CAPACITY":
            case "OVERALL_CAPACITY":
            case "MOTOR_SPEED_REGULATION":
            case "CLEANING_WIDTH":
            case "DISPLAY_INCHES":
            case "FLASH_MEMORY_CAPACITY":
            case "CORD_LENGTH":

                answer = isPositiveDouble(value);
                break;
            case "NUMBER_OF_SPEAKERS":
                answer = isPositiveInteder(value);
                break;
            case "OS":
            case "FILTER_TYPE":
            case "BAG_TYPE":
            case "WAND_TYPE":
            case "COLOR":
                answer = !isEmptyString(value);
                break;
            case "FREQUENCY_RANGE":
                answer = isDoubleRange(value);
                break;
            default:
                answer = false;
        }

        return answer;
    }

    /**
     * Checks if string matches regular expression
     *
     * @param value - string to be checked
     * @param reg   - regular expression
     * @return true if string matches regExpression, false in other case
     */
    static boolean isMatch(String value, String reg) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

    /**
     * Checks if object is a positive integer
     *
     * @param value - checked object
     * @return true if is a positive int, false in other cases
     */
    static boolean isPositiveInteder(Object value) {
        return isMatch(value.toString(), "[1-9]\\d*");
    }

    /**
     * Checks if object is a positive double
     *
     * @param value - checked object
     * @return true if is a positive double, false in other cases
     */
    static boolean isPositiveDouble(Object value) {
        return isMatch(value.toString(), "([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*)");
    }

    /**
     * Checks if object is an empty string
     *
     * @param value - checked object
     * @return true if is an empty string, false in other cases
     */
    static boolean isEmptyString(Object value) {
        return value.toString().isEmpty();
    }

    /**
     * Checks if object is a range of doubles string
     *
     * @param value - checked object
     * @return true if is a range of doubles string, false in other cases
     */
    static boolean isDoubleRange(Object value) {
        boolean answer = isMatch(value.toString(),
                "(([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*))-(([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*))<fv");
        if (answer) {
            String[] mas = value.toString().split("-");
            double n1 = Double.parseDouble(mas[0]);
            double n2 = Double.parseDouble(mas[1]);
            if (n2 <= n1) {
                answer = false;
            }
        }
        return answer;
    }

}