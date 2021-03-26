package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addItem(new Item("Apple", 200, 1_500));
        bill.addItem(new Item("Bread", 15, 120));
        bill.addItem(new Item("Butter", 10, 450));

        System.out.println(bill.getItems().toString());
        System.out.println("-------------------------------------------------------------");
        bill.calculateTotalPrice();
    }
}
