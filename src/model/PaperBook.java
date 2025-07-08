package model;

public class PaperBook extends Book implements ShippableBook {
    private int quantity;
    public PaperBook(String title, String author, int year, double price, int quantity) {
        super(title, author, year, price);
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void deliver(int buyQuantity, String email) {
        if ( quantity >= buyQuantity) {
            quantity -= buyQuantity;
            System.out.println("Shipping " + buyQuantity + "x " + this.getTitle());
        } else {
            System.out.println("Not enough stock.");
        }
    }
}
