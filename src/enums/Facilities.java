/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Sai Kumar Uppala
 */
public enum Facilities {

    /**
     * This enum variable contains Facility value for Casino
     */
    CASINO(100),
    /**
     * This enum variable contains Facility value for Spa
     */
    SPA(65),
    /**
     * This enum variable contains Facility value for Gym
     */
    GYM(50),
    /**
     * This enum variable contains Facility value for games
     */
    GAMES(80),
    /**
     * This enum variable contains Facility value for BuffetRestaurant
     */
    BUFFETRESTAURANT(120),
    /**
     * This enum variable contains Facility value for Food
     */
    FOOD(20),
    /**
     * This enum variable contains Facility value for UpperDeck
     */
    UPPERDECK(20),
    /**
     * This enum variable contains Facility value for Drinks
     */
    DRINKS(10);

    private double facilityPrice;

    private Facilities(double facilityPrice) {
        this.facilityPrice = facilityPrice;
    }

    /**
     *
     * @return This method returns the facility price of enum variables.
     */
    public double getFacilityPrice() {
        return facilityPrice;
    }

    /**
     *
     * @param facilityPrice This method sets the facility price of enum
     * variable.
     */
    public void setFacilityPrice(double facilityPrice) {
        this.facilityPrice = facilityPrice;
    }

}
