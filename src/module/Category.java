package module;

        public class Category extends Main_category{
        int item_id;

                public int getItem_id() {
                        return item_id;
                }

                public void setItem_id(int item_id) {
                        this.item_id = item_id;
                }
                public Category(String dessert_type, int item_id) {
                        super(dessert_type);
                        this.item_id = item_id;
                }

        }

