import module.Customer;
import module.Items;
import module.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items b_1 = new Items("Hot", 36758,"Hot Cocoa");
        Items b_2 = new Items("Cold", 35699,"Ice-cream Cake");
        Items b_3 = new Items("Moderate", 467089, "Cookies");
        Items b_4 = new Items("Hot", 78958,"Latte");
        Items b_5 = new Items("Moderate", 464089, "Muffins");
        Items b_6 = new Items("Cold", 35239,"Cheese Cake");

        ArrayList<Items> Cold_items = new ArrayList<>();
        Cold_items.add(b_2);
        Cold_items.add(b_6);

        ArrayList<Items> Moderate_items = new ArrayList<>();
        Moderate_items.add(b_3);
        Moderate_items.add(b_5);

        ArrayList<Items> Hot_items = new ArrayList<>();
        Hot_items.add(b_1);
        Hot_items.add(b_4);


        Order o_1 = new Order("Ayden Vulpian", b_3,450);
        Order o_2 = new Order("Claire Rose",  b_1,290);
        Order o_3 = new Order("Eddy Lee", b_6,380);
        Order o_4 = new Order("Christan Howard",  b_4,130);


        ArrayList<Order> male_customers = new ArrayList<>();
        male_customers.add(o_1);
        male_customers.add(o_4);

        ArrayList<Order> female_customers = new ArrayList<>();
        female_customers.add(o_2);
        female_customers.add(o_3);

        Customer c1 = new Customer(1, male_customers, 543210);
        Customer c2 = new Customer(2, male_customers, 621025);

        b_3.getOrdered_list();

    }
}