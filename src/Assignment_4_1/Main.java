package Assignment_4_1;

import  Assignment_4_1.models.Product;
import  Assignment_4_1.models.Variant;
import  Assignment_4_1.models.VariantBasedProduct;
import  Assignment_4_1.models.WeightBasedProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main (String[] args) {

            //Create products
            Product apple = new WeightBasedProduct("Apple","imageUrl",30f,2.8f);
            Product surfExcel = new VariantBasedProduct("surfExcel","imageUrl", new ArrayList<>(
                    Arrays.asList(new Variant("500g", 60), new Variant("1.5g", 299))));

            //Printing these products
            System.out.println(apple);
            System.out.println(surfExcel);

            //Add these product in List
            List<Product> products = new ArrayList<>(Arrays.asList(new WeightBasedProduct("Banana","imageUrl",40f,3.9f),
                    new VariantBasedProduct("Kiwi", " imageUrl", new ArrayList<>(Arrays.asList(new Variant("5Kg", 60), new Variant("3Kg", 70))))));


            //Printing all products in a Single list
            System.out.println(products);
        }
}
