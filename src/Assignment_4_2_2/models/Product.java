package Assignment_4_2_2.models;

import Assignment_4_2_1.models.ProductType;
import Assignment_4_2_1.models.Variant;

import java.util.List;

public class Product {

        //common
        public String name, imageUrl;
        public int type;

        //for WEIGHT BASED PRODUCT
        float minQuantity, pricePerKg;

        //for VARIANT BASED PRODUCT
        public List<Variant> variants;


        //Constructor for WEIGHT BASED PRODUCT
        public Product(String name, String imageUrl, float minQuantity, float pricePerKg){
             this.type = ProductType.TYPE_WEIGHT_BASED_PRODUCT;
             this.name = name;
             this.imageUrl = imageUrl;
             this.minQuantity = minQuantity;
             this.pricePerKg = pricePerKg;
        }

        //Constructor for VARIANT BASED PRODUCT
    public Product(String name, String imageUrl, List<Variant> variants) {
        this.type = ProductType.TYPE_VARIANT_BASED_PRODUCT;
        this.name = name;
        this.imageUrl = imageUrl;
        this.variants = variants;
    }


    @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();

            if (this.type == ProductType.TYPE_WEIGHT_BASED_PRODUCT) {
                stringBuilder.append("Weight Based Product { ");
            }
            else {
                stringBuilder.append("Variant Based Product { ");
            }

            stringBuilder.append("name = ").append(name);

            if (this.type == ProductType.TYPE_VARIANT_BASED_PRODUCT) {
                stringBuilder.append(", minQuantity = ").append(minQuantity);
                stringBuilder.append(", pricePerKg = ").append(pricePerKg);
            }
            else {
                stringBuilder.append(", variants = ").append(variants);
            }

            stringBuilder.append(" } ");

            return stringBuilder.toString();
        }
}
