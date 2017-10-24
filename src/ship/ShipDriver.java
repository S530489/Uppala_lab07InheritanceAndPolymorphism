/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sai Kumar Uppala
 */
public class ShipDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner scan = new Scanner(new File("ship.txt"));
        String manufactureName = scan.nextLine().trim();
        int modelSeriesTag = scan.nextInt();
        ArrayList<Ship> shiplist = new ArrayList<>();
        System.out.println("*****************************************************************");
        System.out.println("Welcome to " + manufactureName);
        System.out.println("*****************************************************************\n");
        while (scan.hasNext()) {
            String shipType = scan.nextLine().trim();

            if (shipType.equals("Passenger Ship")) {

                String model = scan.nextLine().trim();
                String ShipName = scan.nextLine().trim();
                Point p1 = new Point(Double.parseDouble(scan.next()), Double.parseDouble(scan.next()));
                Point p2 = new Point(Double.parseDouble(scan.next()), Double.parseDouble(scan.nextLine().trim()));

                String modelSeries = scan.nextLine();
                Double BasePrice = scan.nextDouble();
                scan.nextLine();

                if (model.equals("Cruise")) {
                    PassengerShip cs = new Cruise(manufactureName, modelSeriesTag, ShipName, p1, p2, modelSeries, BasePrice);
                    shiplist.add(cs);

                    cs.addFacilities(scan.nextLine().trim());
                    System.out.println("Cruise details: ");
                    System.out.println(cs.toString());
                    if (shiplist.size() > 1) {
                        System.out.println(util.Utility.knowHowFarIsYourShipFromOthers(cs, shiplist));
                    }
                    System.out.println("*****************************************************************\n");
                } else if (model.equals("Ferry")) {
                    double time = scan.nextDouble();
                    scan.nextLine();
                    PassengerShip fs = new Ferry(manufactureName, modelSeriesTag, ShipName, p1, p2, modelSeries, BasePrice, time);
                    shiplist.add(fs);
                    //System.out.println("camehere");
                    fs.addFacilities(scan.nextLine().trim());
                    System.out.println("Ferry details: ");
                    System.out.println(fs.toString());
                    if (shiplist.size() > 1) {
                        System.out.println(util.Utility.knowHowFarIsYourShipFromOthers(fs, shiplist));
                    }
                    System.out.println("*****************************************************************\n");
                }
            } else if (shipType.equals("Cargo Ship")) {
                String type = scan.nextLine().trim();
                Good g = new Good(type, Integer.parseInt(scan.nextLine()), Double.parseDouble(scan.nextLine()));
                String shipName = scan.nextLine().trim();
                Point p1 = new Point(Double.parseDouble(scan.next()), Double.parseDouble(scan.next()));
                Point p2 = new Point(Double.parseDouble(scan.next()), Double.parseDouble(scan.nextLine().trim()));
                String modelSeries = scan.nextLine();

                CargoShip cargo = new CargoShip(manufactureName, modelSeriesTag, shipName, p1, p2, "Cargo");
                cargo.addGoods(g);
                shiplist.add(cargo);
                System.out.println("Cargo Ship details: ");
                System.out.println(cargo.toString());
                if (shiplist.size() > 1) {
                    System.out.println(util.Utility.knowHowFarIsYourShipFromOthers(cargo, shiplist));
                }
                System.out.println("*****************************************************************\n");
            }
        }

    }

}
