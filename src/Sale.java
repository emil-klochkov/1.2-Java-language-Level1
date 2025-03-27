import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        totalPrice = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}