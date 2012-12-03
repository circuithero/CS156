/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carclassifier;

/**
 * A class that determines the classification of passenger vehicles.
 *
 * @author Danny Ng
 * @version 1.0
 */
public class CarClassifier {
    private static final int MINI_LOW = 1500;
    private static final int MINI_HIGH = 1999;
    private static final int LIGHT = 2499;
    private static final int COMPACT = 2999;
    private static final int MEDIUM = 3499;
    private static final int HEAVY = 3500;
    private static int LUXURY = 30000;
    private static final int SPORT = 200;
    private String type;
    private static int THRESHOLD = 5000;

    /**
     * Determine whether the model is a sport or luxury vehicle.
     *
     * @param cost the cost of the vehicle
     * @param hp the horsepower of the vehicle
     * @return the type of the vehicle
     */
    public String calculateCost(int cost, int hp) {
        String costType = "";
        int luxuryCost = (LUXURY + cost / 2) - THRESHOLD;
        if (luxuryCost > LUXURY) {
            LUXURY = luxuryCost;
        }

        if (cost >= LUXURY) {
            costType = " luxury";
        }
        if (hp >= SPORT) {
            if (!type.equalsIgnoreCase(" SUV") && 
                    !type.equalsIgnoreCase(" minivan")) {
                costType += " sports";
            }
        }
        return costType;
    }

    /**
     * Determine the NHTSA car class of the vehicle.
     *
     * @param weight the weight of the vehicle in pounds
     * @return the class of the vehicle
     */
    public String calculateClass(int weight) {
        String classification = "";

        if (weight >= MINI_LOW && weight <= MINI_HIGH) {
            classification = " mini";
        } else if (weight < LIGHT) {
            classification = " light";
        } else if (weight < COMPACT) {
            classification = " compact";
        } else if (weight < MEDIUM) {
            classification = " mid-size";
        } else if (weight > HEAVY) {
            classification = " full-size";
        }
        return classification;
    }

    /**
     * Determine the type of a vehicle.
     *
     * @param doors the number of doors on the vehicle
     * @param seats the amount of seating in the vehicle
     * @return the type of the vehicle
     */
    public String calculateType(int doors, int seats) {

        if (doors == 2) {
            type = " roadster";
        } else if (doors == 3) {
            type = " hatchback";
        } else if (doors == 4) {
            if (seats == 5) {
                type = " sedan";
            } else if (seats == 7 || seats == 8) {
                type = " minivan";
            }
        } else if (doors == 5) {
            if (seats == 7) {
                type = " SUV";
            } else {
                type = " hatchback";
            }
        }
        return type;
    }
}
