package problem2;

public class Invoice {

    private String partNumbber;

    private String partDescription;

    private int quantityOfItem;

    private double priceofTheItem;

    public Invoice(String partNumbber, String partDescription, int quantityOfItem, double priceofTheItem) {
        this.partNumbber = partNumbber;
        this.partDescription = partDescription;
        this.quantityOfItem = quantityOfItem;
        this.priceofTheItem = priceofTheItem;
    }

    public String getPartNumbber() {
        return partNumbber;
    }

    public void setPartNumbber(String partNumbber) {
        this.partNumbber = partNumbber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        if (quantityOfItem < 0) {
            this.quantityOfItem = 0;
        } else {
            this.quantityOfItem = quantityOfItem;
        }
    }

    public double getPriceofTheItem() {
        return priceofTheItem;
    }

    public void setPriceofTheItem(double priceofTheItem) {
        if (priceofTheItem < 0) {
            this.priceofTheItem = 0.0;
        } else {
            this.priceofTheItem = priceofTheItem;
        }

    }

    public double getInvoiceAmount() {
        setQuantityOfItem(quantityOfItem);
        setPriceofTheItem(priceofTheItem);

        return 2 * (quantityOfItem * priceofTheItem);
    }
}
