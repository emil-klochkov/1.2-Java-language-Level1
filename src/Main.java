//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        sale.addProduct(new Product("Laptop", 1200.50));
        sale.addProduct(new Product("Phone", 850.75));

        try {
            sale.calculateTotal();
            System.out.println("Total sale price: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        List<String> list = new ArrayList<>();
        list.add("Item 1");

        try {
            System.out.println(list.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
