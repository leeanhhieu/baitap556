// Main.java
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "iPhone X", 10, 15000000);
        Product product2 = new Product(2, "Samsung Galaxy S10", 0, 12000000);

        Cart cart = new Cart();
        cart.setId(1);
        cart.setCustomer("Nguyen Van A");
        cart.setCity("Hanoi");
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.calculateGrandTotal();

        System.out.println("Cart's Grand Total: " + cart.getGrandTotal());
    }
}
