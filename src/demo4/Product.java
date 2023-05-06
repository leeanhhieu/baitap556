// Product.java
public class Product {
    private int id;
    private String productName;
    private int qty;
    private double price;

    public Product(int id, String productName, int qty, double price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
        checkQty();
    }

    private void checkQty() {
        if (qty <= 0) {
            System.out.println(productName + " is out of stock.");
        } else {
            System.out.println(productName + " is still available.");
        }
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
