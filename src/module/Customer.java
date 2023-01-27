package module;
import java.util.ArrayList;

public class Customer {
    int name;
    ArrayList<Order> order;
    int contacts;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }

    public int getContacts() {
        return contacts;
    }

    public void setContacts(int contacts) {
        this.contacts = contacts;
    }

    public Customer(int name, ArrayList<Order> order, int contacts) {
        this.name = name;
        this.order = order;
        this.contacts = contacts;
    }
}