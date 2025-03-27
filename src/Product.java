public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
