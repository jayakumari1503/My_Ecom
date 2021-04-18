package Assignment_4_2_2.models;


import Assignment_4_1.models.Variant;
import Assignment_4_2_1.models.Product;
import java.util.HashMap;
import java.util.Scanner;

public class CartOperations {
    private final static Scanner scanner = new Scanner(System.in);

    public static void addItems(HashMap<String, Product> products) {
        String name,imageURL;
        float quantity;

        System.out.println("Enter the product name you want to add in the cart : ");
        name = scanner.next();

        if(!products.containsKey(name)){
            System.out.println("Entered product is unavailable");
        }
        else if(products.get(name).type == ProductType.TYPE_WEIGHT_BASED_PRODUCT){
            Cart cart = new Cart();
            System.out.println("Enter the quantity you want to add");
            quantity = scanner.nextFloat();
            cart.add(products.get(name),quantity);
            System.out.println("Your product have been successfully added");
        }
        else if(products.get(name).type == ProductType.TYPE_VARIANT_BASED_PRODUCT){
            Cart cart = new Cart();
            int noOfVariants=0;
            System.out.println("Choose among the following variants - ");
            for(Variant variants : products.get(name).variants){
                System.out.println(noOfVariants + " : " + variants);
                noOfVariants++;
            }
            noOfVariants = scanner.nextInt();
            cart.add(products.get(name),products.get(name).variants.get(noOfVariants));
            System.out.println("Product added successfully in your cart..");
        }
    }

    public static void editItems(HashMap<String, Product> products) {
        String name, imageUrl;
        System.out.println("Enter the product name you want to edit : ");
        name = scanner.nextLine();
        if(!products.containsKey(name)){
            System.out.println("Product is unavailable");
        }
        else if(products.get(name).type == ProductType.TYPE_WEIGHT_BASED_PRODUCT){
            Cart cart = new Cart();
            float quantity;
            System.out.println("Enter the new quantity you want to add : ");
            quantity = scanner.nextFloat();
            cart.add(products.get(name),quantity);
        }
        else{
            Cart cart = new Cart();
            int noOfVariants = 0;
            System.out.println("Choose among the following variants : ");
            for(Variant variants : products.get(name).variants){
                System.out.println(noOfVariants + " : " + variants);
                noOfVariants++;
            }
            noOfVariants = scanner.nextInt();
            cart.add(products.get(name), products.get(name).variants.get(noOfVariants));
            System.out.println("Your product edited successfully in your cart.");

        }
    }

    public static void removeItems(HashMap<String, Product> products) {
        System.out.println("Enter the name of product you want to remove :");
        String name = scanner.nextLine();
        Cart cart = new Cart();
        cart.removeAll(products.get(name));
        System.out.println("Your product removed successfully from your cart.");
    }
}
