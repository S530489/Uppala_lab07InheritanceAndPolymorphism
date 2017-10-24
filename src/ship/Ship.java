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
public class Ship {

    private String manufactureName;
    private int modelSeries;
    private Point sourceLoctaion;
    private Point destinationLocation;
    private String shipName;
    private String model;

    /**
     *
     */
    public Ship() {
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
    public Ship(String manufactureName, int modelSeries, Point sourceLoctaion, Point destinationLocation, String shipName, String model) {
        this.manufactureName = manufactureName;
        this.modelSeries = modelSeries;
        this.sourceLoctaion = sourceLoctaion;
        this.destinationLocation = destinationLocation;
        this.shipName = shipName;
        this.model = model;
    }

    /**
     *
     * @returns the Manufacturer name
     */
    public String getManufactureName() {
        return manufactureName;
    }

    /**
     *
     * @param manufactureName
     */
    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    /**
     *
     * @returns the Model Series
     */
    public int getModelSeries() {
        return modelSeries;
    }

    /**
     *
     * @param modelSeries
     */
    public void setModelSeries(int modelSeries) {
        this.modelSeries = modelSeries;
    }

    /**
     *
     * @return the source Location
     */
    public Point getSourceLoctaion() {
        return sourceLoctaion;
    }

    /**
     *
     * @param sourceLoctaion
     */
    public void setSourceLoctaion(Point sourceLoctaion) {
        this.sourceLoctaion = sourceLoctaion;
    }

    /**
     *
     * @returns the destination location
     */
    public Point getdestinationLocation() {
        return destinationLocation;
    }

    /**
     *
     * @param destinationLocation
     */
    public void setdestinationLocation(Point destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /**
     *
     * @return the ship Name
     */
    public String getShipName() {
        return shipName;
    }

    /**
     *
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /**
     *
     * @return the model of ship
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return manufactureName;
    }

}
