package problem7;

public class Truck extends Car {
    private int weight;
    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;


    }

    @Override public double getSalePrice() {
        if(weight > 200) {
            System.out.println("Truck Class-->> weight > 200");
            double salePrice = getRegularPrice() + (getRegularPrice() * 0.1);
            setRegularPrice(salePrice);
        } else {
            System.out.println("Truck Class-->> weight < 200");
            double salePrice = getRegularPrice() + (getRegularPrice() * 0.2);
            setRegularPrice(salePrice);

        }
        return  getRegularPrice();
    }

}
