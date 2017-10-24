/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import ship.Point;
import ship.Ship;

/**
 *
 * @author Sai Kumar Uppala
 */
public class Utility {

    private Utility() {
    }

    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    public static double getDistance(Point p1, Point p2) {

        return Math.sqrt(Math.pow((p2.getY() - p1.getY()), 2) + Math.pow((p2.getX() - p1.getX()), 2));
    }

    /**
     *
     * @param shp
     * @param ships
     * @return
     */
    public static String knowHowFarIsYourShipFromOthers(Ship shp, ArrayList<Ship> ships) {

        String distanceString = "Distance between " + shp.getShipName() + " and";

        for (Ship s : ships) {
            if (!s.getShipName().equals(shp.getShipName())) {
                distanceString += "\n 		  " + s.getShipName() + ":" + String.format("%.2f", Math.round(getDistance(shp.getSourceLoctaion(), s.getSourceLoctaion()) * 100) / 100.0);
            }
        }
        return distanceString;

    }
}
