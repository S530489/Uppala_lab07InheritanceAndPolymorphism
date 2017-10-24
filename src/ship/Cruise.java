/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.Facilities;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Cruise extends PassengerShip {

    /**
     * No argument Constructor that calls super class constructor
     */
    public Cruise() {
        super();
    }

    /**
     *
     * @param manufactureName Is the name of the Manufacturer.
     * @param modelSeries Is the model Series of the ship
     * @param shipName Is the ship Name.
     * @param sourceLoctaion Is the starting location before travel
     * @param destinationLocation Is the Destination location
     * @param model is the model of the ship.
     * @param basePrice is the base price for the facilities.
     */
    public Cruise(String manufactureName, int modelSeries, String shipName, Point sourceLoctaion, Point destinationLocation, String model, double basePrice) {
        super(manufactureName, modelSeries, sourceLoctaion, destinationLocation, shipName, model, basePrice);
    }

    /**
     *
     * @returns the cost for the facilities.
     */
    public double calculateCost() {
        double i = 0;
        for (String ele : getFacilities()) {
            i += Facilities.valueOf(ele.toUpperCase()).getFacilityPrice();
        }

        return i + getBasePrice();
    }

    /* This method should return the cruise name, model,  model series, base price, 
    facilities from super class and the cost calculated above of type String in the below format.
cruiseName: Caribbean Princess, BZ09925670
The Base price of the ticket is: $110.0
The facilities chosen are [Casino, Spa, Gym, Games] and the total cost calculated is: $405.0*/
    @Override
    public String toString() {
        return "Cruise Name: " + getShipName() + ", " + getModel() + getModelSeries()
                + "\nThe Base price of the ticket is: $" + getBasePrice()
                + "\nThe facilities chosen are: " + getFacilities()
                + " and the total cost calculated is: $" + calculateCost();
    }

}
