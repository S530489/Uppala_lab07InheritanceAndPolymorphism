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
public class Point {

    private double X;
    private double Y;

    /**
     *
     * @param X is the X-coordinate for the location
     * @param Y is the Y-coordinate for the location
     */
    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     *
     * @returns X
     */
    public double getX() {
        return X;
    }

    /**
     *
     * @param X is the X-coordinate for the location
     */
    public void setX(double X) {
        this.X = X;
    }

    /**
     *
     * @returns Y
     */
    public double getY() {
        return Y;
    }

    /**
     *
     * @param Y is the Y-coordinate for the location
     */
    public void setY(double Y) {
        this.Y = Y;
    }

}
