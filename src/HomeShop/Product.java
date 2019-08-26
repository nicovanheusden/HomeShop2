package HomeShop;

public class Product {
    String name;
    String description;
    double price;

    /**
     * Display a full description of the product
     */
    public void look(){}

    /**
     * Add a product to a bill
     * @param bill the concerned bill
     * @param quantity the quantity wanted
     */
    public void buy(Bill bill, Integer quantity){}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
