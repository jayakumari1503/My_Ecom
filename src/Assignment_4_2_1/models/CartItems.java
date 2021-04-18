package Assignment_4_2_1.models;

public class CartItems {
    public String name;
    public float unitPrice, quantity;


    public CartItems(String name, float unitPrice, float quantity) {

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public float cost() {

        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return  name +'\'' +
                String.format(" ,(Rs. %.2f X %f =Rs. %.2f ", unitPrice, quantity, cost())+")";
    }
}

