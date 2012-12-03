/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carclassifier;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 * A class that determines the classification of passenger vehicles.
 *
 * @author Danny Ng
 * @version 1.0
 */
public class CarClassifier {

    private static final String con = "jdbc:oracle:thin:@localhost:1521:orcl"; //connection string
    private static final String user = "scott"; //database user
    private static final String password = "tiger"; //database password
    private static carsDatabase DBC;
    private static Statement stmnt;
    private static final int MINI_LOW = 1500;
    private static final int MINI_HIGH = 1999;
    private static final int LIGHT = 2499;
    private static final int COMPACT = 2999;
    private static final int MEDIUM = 3499;
    private static final int HEAVY = 3500;
    private static final int LUXURY = 50000;
    private static final int SPORT = 200;
    private String[] carDetails;

    public CarClassifier() {
        try {
            DBC = new carsDatabase(con, user, password);
            stmnt = DBC.getDBConnection().createStatement();
        } catch (SQLException ex)  {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * Determine whether the model is a sport or luxury vehicle.
     *
     * @param cost the cost of the vehicle
     * @param hp the horsepower of the vehicle
     * @return the type of the vehicle
     */
    private String calculateCost(int cost, int hp) {
        String costType = "";

        if (cost >= LUXURY) {
            costType = " luxury";
        }
        if (hp >= SPORT) {
            costType += " sports";
        }
        return costType;
    }

    /**
     * Determine the NHTSA car class of the vehicle.
     *
     * @param weight the weight of the vehicle in pounds
     * @return the class of the vehicle
     */
    private String calculateClass(int weight) {
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
    private String calculateType(int doors, int seats) {
        String type = "";

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
            if (seats == 5) {
                type = " SUV";
            } else if (seats == 7 || seats == 8) {
                type = " minivan";
            }
        }
        return type;
    }
    
    public void getModels(JComboBox manufacturerComboBox, JComboBox modelComboBox) {
        try {
            ResultSet rs;
            String manufacturer = manufacturerComboBox.getSelectedItem().toString();
            
            String query = "select distinct model from "
                    + manufacturer + " order by model asc";
            rs = stmnt.executeQuery(query);
            while (rs.next()) {
                modelComboBox.addItem(rs.getString(1));
            }
            getModelDetails(modelComboBox);
        } catch (Exception e) {
        }
    }
    
    private void getModelDetails(JComboBox modelComboBox) {
        try {
            ResultSet rs;
            String model = modelComboBox.getSelectedItem().toString();
            
            String query = "select * from CARS where model='" + model + "'";
            rs = stmnt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            carDetails = new String[metaData.getColumnCount()];
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                carDetails[i - 1] = rs.getString(i);
            }
            
        } catch (Exception e) {
        }
    }
    
    public String[] getCarDetails() {
        return carDetails;
    }
    
    public int getNumberOfCarDetails() {
        return carDetails.length;
    }
}
