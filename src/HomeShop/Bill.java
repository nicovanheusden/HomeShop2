package HomeShop;

import HomeShop.Delivery.Delivery;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    Customer customer;
    private Map<Product, Integer> products = new HashMap<>();
    Delivery delivery

    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

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
