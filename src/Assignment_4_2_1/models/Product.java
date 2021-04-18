package Assignment_4_2_1.models;

import Assignment_4_1.models.Variant;

import java.util.List;

public class Product {

        //common
        public String name, imageUrl;
        public int type;

        //for WBP
        public float minQuantity, pricePerKg;

        //for VBP
        public List<Variant> variants;

        //Constructor for WB
        public Product(String name, String imageUrl, float minQuantity, float pricePerKg) {
            type = ProductType.TYPE_WB;
            this.name = name;
            this.imageUrl = imageUrl;
            this.minQuantity = minQuantity;
            this.pricePerKg = pricePerKg;
        }

        //Constructor for VB
        public Product(String name, String imageUrl, List<Variant> variants) {
            type = ProductType.TYPE_VB;
            this.name = name;
            this.imageUrl = imageUrl;
            this.variants = variants;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            if (type == ProductType.TYPE_WEIGHT_BASED_PRODUCT)
                builder.append("Weight Based Product { ");
            else
                builder.append("Variant Based Product { ");

            builder.append("name = ").append(name);

            if (type == ProductType.TYPE_WEIGHT_BASED_PRODUCT) {
                builder.append(", minQuantity = ").append(minQuantity);
                builder.append(", pricePerKg = ").append(pricePerKg);
            } else {
                builder.append(", variants = ").append(variants);
            }

            builder.append(" } ");

            return builder.toString();
        }
    }
