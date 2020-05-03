package problem7;

public class Ford extends Car {
    private int weight;
    private int manufacturerDiscount;

    Ford(int weight, int manufacturerDiscount,int speed, double regularPrice, String color) {
        super(speed,regularPrice,color);
        this.weight = weight;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override public double getSalePrice() {
        System.out.println("Ford Class");
        double price = getRegularPrice() - manufacturerDiscount;
       return price;
    }
}
