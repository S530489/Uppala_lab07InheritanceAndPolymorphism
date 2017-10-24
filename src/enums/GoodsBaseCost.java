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
public enum GoodsBaseCost {

    /**
     * This enum variable contains Initial cost for LowWeight and HeavyWeight.
     */
    ANIMALS(1000, 2000),
    /**
     * This enum variable contains Initial cost for LowWeight and HeavyWeight.
     */
    CHEMICAL(1000, 3000),
    /**
     * This enum variable contains Initial cost for LowWeight and HeavyWeight.
     */
    WOOD(900, 2000),
    /**
     * This enum variable contains Initial cost for LowWeight and HeavyWeight.
     */
    VEHICLES(1100, 2500),
    /**
     * This enum variable contains Initial cost for LowWeight and HeavyWeight.
     */
    OTHERS(800, 1600);

    private double initialCostForLowWeight;
    private double initialCostForHeavyWeight;

    private GoodsBaseCost(double initialCostForLowWeight, double initialCostForHeavyWeight) {
        this.initialCostForLowWeight = initialCostForLowWeight;
        this.initialCostForHeavyWeight = initialCostForHeavyWeight;
    }

    /**
     *
     * @return This methods returns the value of Animals.
     */
    public static GoodsBaseCost getANIMALS() {
        return ANIMALS;
    }

    /**
     *
     * @return This methods returns the value of Chemicals.
     */
    public static GoodsBaseCost getCHEMICAL() {
        return CHEMICAL;
    }

    /**
     *
     * @return This methods returns the value of Wood.
     */
    public static GoodsBaseCost getWOOD() {
        return WOOD;
    }

    /**
     *
     * @return This methods returns the value of Vehicles.
     */
    public static GoodsBaseCost getVEHICLES() {
        return VEHICLES;
    }

    /**
     *
     * @return This methods returns the value of Others.
     */
    public static GoodsBaseCost getOTHERS() {
        return OTHERS;
    }

    /**
     *
     * @return This methods returns the LowWeight cost.
     */
    public double getInitialCostForLowWeight() {
        return initialCostForLowWeight;
    }

    /**
     *
     * @return This methods returns the HeavyWeight Cost.
     */
    public double getInitialCostForHeavyWeight() {
        return initialCostForHeavyWeight;
    }

}
