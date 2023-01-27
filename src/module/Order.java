
package module;
import java.util.ArrayList;

public class Order {
    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    String customer_name;
    ArrayList<Items> items;
    double price;

    public Order(String customer_name, ArrayList<Items> items, double price) {
        this.customer_name = customer_name;
        this.items = items;
        this.price = price;
    }

    public void getBill() {
        System.out.println("\n");
        System.out.println("Your Bill is " + this.getPrice());
    }
}