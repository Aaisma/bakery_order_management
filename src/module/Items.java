package module;

public class Items extends Category{
    String ordered_item;
    int amount;

    public Items(String dessert_type, int item_id, String ordered_item) {
        super(dessert_type, item_id);
        this.ordered_item = ordered_item;
    }

    public String getOrdered_item() {
        return ordered_item;
    }

    public void setOrdered_item(String ordered_item) {
        this.ordered_item = ordered_item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void getOrdered_list () {
        System.out.println("ORDERED LIST");
        System.out.println("The dessert they ordered is " +this.dessert_type());
        System.out.println("They ordered items from list " + this.item_id());
        System.out.println("The item ordered was " + this.getOrdered_item());
    }

}
