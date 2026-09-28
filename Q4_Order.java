import java.util.ArrayList;
import java.util.List;

public class Q4_Order {

    // Product Class
    public static class Product {
        private String productName;
        private double price;
        private int quantity;

        // Default Constructor
        public Product() {
            this.productName = "";
            this.price = 0;
            this.quantity = 0;
        }

        // Parameterized Constructor
        public Product(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters and Setters
        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Calculate total for product
        public double getTotal() {
            return price * quantity;
        }

        // Override toString()
        @Override
        public String toString() {
            return productName + " x" + quantity + " = " + getTotal();
        }
    }

    // Order Class
    public static class Order {
        private String orderId;
        private List<Product> products;

        // Default Constructor
        public Order() {
            this.orderId = "";
            this.products = new ArrayList<>();
        }

        // Parameterized Constructor
        public Order(String orderId) {
            this.orderId = orderId;
            this.products = new ArrayList<>();
        }

        // Getters and Setters
        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        // Add Product
        public void addProduct(Product product) {
            products.add(product);
        }

        // Calculate Total
        public double calculateTotal() {
            double total = 0;
            for (Product product : products) {
                total += product.getTotal();
            }
            return total;
        }

        // Override toString()
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Order ID: ").append(orderId).append("\n");
            sb.append("Products:\n");
            for (Product product : products) {
                sb.append(product.toString()).append("\n");
            }
            sb.append("Total: ").append(calculateTotal());
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Create Order
        Order order = new Order("ORD101");

        // Create and add Products
        Product laptop = new Product("Laptop", 50000, 1);
        Product mouse = new Product("Mouse", 500, 2);
        Product keyboard = new Product("Keyboard", 1500, 1);

        order.addProduct(laptop);
        order.addProduct(mouse);
        order.addProduct(keyboard);

        // Print Order Details
        System.out.println(order);
    }
}
