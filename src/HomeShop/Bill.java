package HomeShop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    Customer customer;
    Map<Product, Integer> products = new HashMap<>();

    /**
     * Add a product with a quantity in a bill
     * @param product
     * @param quantity
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
