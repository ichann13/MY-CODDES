public class Item {
    int itemNum;
    String itemDescription;
    double unitPrice;
    int qtyOnHand;
    double inv;

    Item(int itemNumber, String itemDescription, double unitPrice, int quantityOnHand) {
        this.itemNum = itemNum;
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
        this.qtyOnHand = quantityOnHand;
        computeInv();
    }

    public void displayItemInfo() {
        System.out.println("Item Number: " + itemNum);
        System.out.println("Item Description: " + itemDescription);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity on Hand: " + qtyOnHand);
        System.out.println("Inventory: " + inv);

    }

    public double computeInv() {
        return inv = qtyOnHand * unitPrice;
    }

    public static void main(String[] args) throws Exception {

        Item o = new Item(00000, "Mouse", 250.00, 3);

        o.displayItemInfo();
        o.computeInv();
    }
}
