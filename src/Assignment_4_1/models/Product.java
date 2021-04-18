package Assignment_4_1.models;

public class Product {
    String name, imageUrl;

    public Product(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name +'\'' + ", imageUrl ='" + imageUrl + '\'' + '}' ;
    }
}
