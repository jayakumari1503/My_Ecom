package Assignment_4_2_2.models;

public class CartItems {
        String name;
        float unitPrice, quantity;

    public CartItems(String name, float unitPrice, float quantity) {

            this.name = name;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

    public float cost() {

            return unitPrice * quantity;
    }

    @Override
        public String toString() {
            return "\n" + name +'\'' +
                    String.format(" ,(Rs. %.2f X %.2f =Rs. %.2f ", unitPrice, quantity, cost())+")";
    }
}
