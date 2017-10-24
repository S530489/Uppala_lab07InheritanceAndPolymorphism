/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.ArrayList;

/**
 *
 * @author Sai Kumar Uppala
 */
public class PassengerShip extends Ship {

    private double basePrice;
    private ArrayList<String> facilities;

    /**
     * No argument Constructor that calls super class constructor
     */
    public PassengerShip() {
        super();
    }

    /**
     *
     * @param basePrice is the base price for the facilities.
     */
    public PassengerShip(double basePrice) {
        this.basePrice = basePrice;
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
     *
     */
    public PassengerShip(String manufactureName, int modelSeries, Point sourceLoctaion, Point destinationLocation, String shipName, String model, double basePrice) {
        super(manufactureName, modelSeries, sourceLoctaion, destinationLocation, shipName, model);
        this.basePrice = basePrice;
        facilities = new ArrayList<>();
    }

    /**
     *
     * @return the base price of facilities.
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     *
     * @param basePrice is the base price for the facilities.
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     *
     * @returns the facilities ArrayList
     */
    public ArrayList<String> getFacilities() {
        return facilities;
    }

    /**
     *
     * @param facilities sets the facilities ArrayList
     */
    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }

    /**
     *
     * @param options is the String that contains facilities.
     * @returns the facilities ArrayList.
     */
    public ArrayList<String> addFacilities(String options) {
        //System.out.println(options);
        for (String element : options.split(",")) {
            facilities.add(element);
        }
        return facilities;
    }

    /**
     *
     * @return the base cost
     */
    public double calculateCost() {
        return this.basePrice;
    }

    @Override
    public String toString() {
        return facilities + "";
    }

}
