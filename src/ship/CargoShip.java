/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.ArrayList;
import enums.GoodsBaseCost;
import util.Utility;

/**
 *
 * @author Sai Kumar Uppala
 */
public class CargoShip extends Ship {

    private ArrayList<Good> goods;

    /**
     * No argument constructor.
     */
    public CargoShip() {
        super();
    }

    /**
     *
     * @param goods is of type ArrayList contains Good class Object.
     */
    public CargoShip(ArrayList<Good> goods) {
        this.goods = goods;
    }

    /**
     *
     * @param manufactureName Is the name of the Manufacturer.
     * @param modelSeries Is the model Series of the ship
     * @param shipName Is the ship Name.
     * @param sourceLoctaion Is the starting location before travel
     * @param destinationLocation Is the Destination location
     * @param model is the model of the ship.
     */
    public CargoShip(String manufactureName, int modelSeries, String shipName, Point sourceLoctaion, Point destinationLocation, String model) {
        super(manufactureName, modelSeries, sourceLoctaion, destinationLocation, shipName, model);
        goods = new ArrayList<>();
    }

    /**
     *
     * @param options is the Object of Good type.
     * @returns the goods arrayList.
     */
    public ArrayList<Good> addGoods(Good options) {
        goods.add(options);
        return goods;
    }

    /**
     *
     * @returns the Distance traveled by the ship
     */
    public double getDistance() {
        return Utility.getDistance(getSourceLoctaion(), getdestinationLocation());

    }

    /**
     *
     * @returns the cost based on weight and distance for the particular good.
     */
    public double calcCostBasedOnWeightNDist() {

        for (Good g : goods) {
            //System.out.println(getDistance());
            if (g.getStockWeight() >= 2000 && getDistance() >= 1000) {
                return GoodsBaseCost.valueOf(g.getType().toUpperCase()).getInitialCostForHeavyWeight() + 2.60 * getDistance();
            } else if (g.getStockWeight() < 2000 && getDistance() >= 1000) {
                return GoodsBaseCost.valueOf(g.getType().toUpperCase()).getInitialCostForLowWeight() + 2.60 * getDistance();
            } else if (g.getStockWeight() < 2000 && getDistance() < 1000) {
                return GoodsBaseCost.valueOf(g.getType().toUpperCase()).getInitialCostForLowWeight() + 1.33 * getDistance();
            } else if (g.getStockWeight() >= 2000 && getDistance() < 1000) {
                return GoodsBaseCost.valueOf(g.getType().toUpperCase()).getInitialCostForHeavyWeight() + 1.33 * getDistance();
            }
        }
        //System.out.println("sai");
        return 0.0;
    }

    /**
     *
     * @returns the cost based on weight and distance including tax for the
     * particular good.
     */
    public double calculateCostWithTax() {
        double total = 0;
        for (Good g : goods) {
            if (g.getType().equals("Chemical")) {
                //System.out.println("done");
                return calcCostBasedOnWeightNDist() * 1.14;
            } else if (g.getType().equals("Wood")) {
                return calcCostBasedOnWeightNDist() * 1.10;
            } else if (g.getType().equals("Food")) {
                return calcCostBasedOnWeightNDist() * 1.12;
            } else {
                return calcCostBasedOnWeightNDist() * 1.08;
            }
        }
        System.out.println("saitax");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Cargo Ship Name: " + getShipName() + "\nThe distance to be travelled by the ship is "
                + Math.round(getDistance() * 100) / 100.0 + " miles\nThe type of stock on the ship is " + "'" + goods.get(0).getType() + "' "
                + "weighing " + goods.get(0).getStockWeight() + " tons\n"
                + "The total cost calculated to carry the stock is: $" + Math.round(calculateCostWithTax() * 100) / 100.0;
    }

}
