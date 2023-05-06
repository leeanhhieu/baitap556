import java.util.ArrayList;
// Cart.java
public class Cart {
    private int id;
    private String customer;
    private double grandTotal;
    private ArrayList<Product> productList;
    private String city;

    public Cart() {
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void calculateGrandTotal() {
        double shippingFee;
        if (city.equals("Hanoi") || city.equals("Ho Chi Minh City")) {
            shippingFee = 0.01;
        } else {
            shippingFee = 0.02;
        }
        grandTotal = 0;
        for (Product product : productList) {
            grandTotal += product.getPrice();
        }
        grandTotal *= (1 + shippingFee);
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
