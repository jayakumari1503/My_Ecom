package Assignment_4_2_1.models;

import Assignment_4_1.models.Variant;

import java.util.HashMap;

    public class Cart {
        HashMap<String, CartItems> cartItems = new HashMap<>();
        float total;
        int noOfItems;

        //Adding WBP
        public void add(Product product, float quantity) {


            //if item already exist in cart
            if (cartItems.containsKey(product.name)) {
                total -= cartItems.get(product.name).cost();

                cartItems.get(product.name).quantity = quantity;
            }

            //Adding for first time
            else {
                CartItems item = new CartItems(product.name, product.pricePerKg, quantity);
                cartItems.put(product.name, item);
                noOfItems++;
            }

            //Update cart summary
            total += product.pricePerKg * quantity;
        }

        //Adding VBP
        public void add(Product product, Variant variant) {
            String key = product.name + " " + variant.amount;

            //If item already exists in cart
             if (cartItems.containsKey(key)) {
                cartItems.get(key).quantity++;
            }

            //Adding for first time
            else {
                CartItems item = new CartItems(product.name, variant.price, 1);
                cartItems.put(key, item);
            }

            //update cart summary
            noOfItems++;
            total += variant.price;
        }

        //Removing products
        public void remove(Product product) {
            if(product.type == ProductType.TYPE_WEIGHT_BASED_PRODUCT)
                removeWB(product);
            else
                removeAllVB(product);
        }

        //removing WBP
        public void removeWB(Product product) {
            //update cart summary
            total -= cartItems.get(product.name).cost();
            noOfItems--;
            cartItems.remove(product.name);
        }

        //removing VBP
        public void removeAllVB(Product product) {
            for (Variant variant : product.variants) {
                String key = product.name + " " + variant.amount;
                if (cartItems.containsKey(key)) {
                    total -= cartItems.get(key).cost();
                    noOfItems -= cartItems.get(key).quantity;
                    cartItems.remove(key);
                }
            }
        }

            //For decrement the quantity of VBP
        public void decrement(Product product, Variant variant){
                    String key = product.name + " " + variant.amount;

                    //Update cart quantity
                    cartItems.get(key).quantity--;

                    //Update cart Summary
                    total -= variant.price;
                    noOfItems--;

                    //Remove a function when if quantity = 0
                    if (cartItems.get(key).quantity == 0)
                        cartItems.remove(key);
                }

        @Override
        public String toString() {
            return cartItems.values()
                    + String.format("\ntotal %d items(Rs. %f)", noOfItems, total);
        }
    }