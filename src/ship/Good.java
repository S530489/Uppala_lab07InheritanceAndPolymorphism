/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Good {

    private String type;
    private int stockID;
    private double stockWeight;

    /**
     *
     * @param type is the type of Good
     * @param stockID is the Id of Good
     * @param stockWeight is the weight for the Good
     */
    public Good(String type, int stockID, double stockWeight) {
        this.type = type;
        this.stockID = stockID;
        this.stockWeight = stockWeight;
    }

    /**
     *
     * @returns the type of Good
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type is the type of Good
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @returns the Id for the Good
     */
    public int getStockID() {
        return stockID;
    }

    /**
     *
     * @param stockID is the Id of Good
     */
    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    /**
     *
     * @returns the stock weight for the Good
     */
    public double getStockWeight() {
        return stockWeight;
    }

    /**
     *
     * @param stockWeight is the weight for the Good
     */
    public void setStockWeight(double stockWeight) {
        this.stockWeight = stockWeight;
    }

}
