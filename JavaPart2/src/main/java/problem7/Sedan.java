package problem7;

public class Sedan extends Car {
    private int length;
    Sedan(int length, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override public double getSalePrice() {
        if(length > 10) {
            System.out.println("Sedan Class-->> length > 10");
            double salePrice = getRegularPrice() + (getRegularPrice() * 0.5);
            setRegularPrice(salePrice);
        } else {
            System.out.println("Sedan Class-->> length < 10");
            double salePrice = getRegularPrice() + (getRegularPrice() * 0.1);
            setRegularPrice(salePrice);

        }
        return getRegularPrice();
    }

}
