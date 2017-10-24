/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import enums.Facilities;
import util.Utility;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Ferry extends PassengerShip {

    private double time;

    /**
     * No argument Constructor that calls super class constructor
     */
    public Ferry() {
        super();
    }

    /**
     *
     * @param time is the time taken for the travel
     */
    public Ferry(double time) {
        this.time = time;
    }

    /**
     *
     * @param time is the time taken for the travel
     * @param basePrice is the base price for the facilities.
     */
    public Ferry(double time, double basePrice) {
        super(basePrice);
        this.time = time;
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
     * @param time is the time taken for the travel
     */
    public Ferry(String manufactureName, int modelSeries, String shipName,
            Point sourceLoctaion, Point destinationLocation,
            String model, double basePrice, double time) {
        super(manufactureName, modelSeries, sourceLoctaion, destinationLocation,
                shipName, model, basePrice);
        this.time = time;
    }

    /**
     *
     * @returns the time taken by the ship
     */
    public double getTime() {
        return time;
    }

    /**
     *
     * @param time sets the time for ship
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     *
     * @returns the speed of ship for the distance traveled.
     */
    public double getSpeed() {

        return Utility.getDistance(getSourceLoctaion(), getdestinationLocation()) / this.time;
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

    /*o	toString():This method should return the ferry name, model,  model series, 
    base price,  facilities from super class, the cost, and speed of the ferry, of type String in the below format. 
Ferry Name: Stena Line Ferry, FX02925670
The Base price of ticket is: $80.0
The facilities chosen are [Food, Upperdeck] and the total cost is: $120.0 
The Speed at which the ferry is travelling: 15.37mph
     */
    @Override
    public String toString() {

        return "Ferry Name: " + getShipName() + ", " + getModel() + getModelSeries()
                + "\nThe Base price of ticket is: $" + getBasePrice()
                + "\nThe facilities chosen are " + getFacilities() + " and the total cost is: $" + calculateCost()
                + "\nThe Speed at which the ferry is travelling: " + Math.round(getSpeed() * 100) / 100.0 + "mph";
    }

}
