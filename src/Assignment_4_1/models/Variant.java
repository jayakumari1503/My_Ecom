package Assignment_4_1.models;

public class Variant {
    public String amount;
    public float price;

    public Variant(String amount, float price) {
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {

        return String.format("%s @ Rs. %.2f", amount,price);
    }
}
