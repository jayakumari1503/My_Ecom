package Assignment_4_2_2;

import Assignment_4_2_2.models.Cart;
import Assignment_4_2_2.models.CartOperations;
import Assignment_4_2_1.models.Product;
import Assignment_4_2_2.models.ProductOperations;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //map all available products
        HashMap<String, Product> products = new HashMap<>();

        //to store items in cart
        Cart cart = new Cart();

        System.out.println("\t\t\t\t\tWelcome to Cart!!");

        System.out.println("\n1.Admin");
        System.out.println("\n2.Customer");


        int user = scanner.nextInt();

        switch(user) {
            case 1:
                System.out.println("\n1.Add Product");
                System.out.println("\n2.Edit Product");
                System.out.println("\n3.Delete Product");
                System.out.println("\n4.See all Products");
                System.out.println("\n5.Exit");


                int choiceFromAdmin = scanner.nextInt();

                switch (choiceFromAdmin) {
                    case 1:
                        ProductOperations.addProduct(products);
                        break;

                    case 2:
                        ProductOperations.editProduct(products);
                        break;

                    case 3:
                        ProductOperations.deleteProduct(products);
                        break;

                    case 4:
                        System.out.println(products.values());
                        break;

                    case 5:
                        System.out.println("You exit from cart.");
                        break;
                }
            break;

            case 2:
                System.out.println("\n1.Add Product(s) into the cart");
                System.out.println("\n2.Edit Product(s) from the cart");
                System.out.println("\n3.Remove Product(s) from the cart");
                System.out.println("\n4.See your cart");
                System.out.println("\n5.Place Order");
                System.out.println("\n6.Cancel Order");
                System.out.println("\n7.Exit from cart");


                int choiceFromCustomer = scanner.nextInt();

                switch (choiceFromCustomer) {
                    case 1:
                        CartOperations.addItems(products);
                        break;

                    case 2:
                        CartOperations.editItems(products);
                        break;

                    case 3:
                        CartOperations.removeItems(products);
                        break;

                    case 4:
                        System.out.println(cart);
                        break;

                    case 5:
                        System.out.println("Order Received...Thank You! Come Again");
                        break;

                    case 6:
                        System.out.println("Order Cancelled!!");
                        break;

                    case 7:
                        System.out.println("You exit the application.");
                        break;

                    default :
                        System.out.println("Error! You entered wrong input.");
                }

                break;

            default :
                System.out.println("ERR0R!! Invalid User!!");
        }
    }
}
