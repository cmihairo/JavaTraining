package problem7;

import javax.sound.midi.Track;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Car car1 = new Car(350, 30.562, "black");
        Car truck1 = new Truck(2500, 150, 20000, "red");
        Car truck2 = new Truck(150, 20, 10.568, "blue");
        Car ford1 = new Ford(1500, 200, 250, 3000, "green");
        Car sedan1 = new Sedan(30, 300, 3589, "black");
        Car sedan2 = new Sedan(15, 280, 10.854, "orange");

        System.out.println("Sale price for car1 = " + car1.getSalePrice());
        System.out.println("Sale price for truck1 = " + truck1.getSalePrice());
        System.out.println("Sale price for truck2 = " + truck2.getSalePrice());
        System.out.println("Sale price for ford1 = " + ford1.getSalePrice());
        System.out.println("Sale price for sedan1 = " + sedan1.getSalePrice());
        System.out.println("Sale price for sedan2 = " + sedan2.getSalePrice());

    }
}
