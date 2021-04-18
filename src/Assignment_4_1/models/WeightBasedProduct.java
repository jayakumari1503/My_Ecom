package Assignment_4_1.models;

public class WeightBasedProduct extends Product {
    float minQuantity;
    float pricePerKg;

    public WeightBasedProduct(String name,String imageUrl,float minQuantity,float pricePerKg) {
        super(name, imageUrl);
        this.minQuantity = minQuantity;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" + "name='" + name + '\'' + ", imageUrl='" + imageUrl + '\'' + ", pricePerKg='" + pricePerKg + ", minQuantity=" + minQuantity + '}';
    }
}
