package model;

public class DemoBook extends Book {
    public DemoBook(String title, String author, int year) {
        super(title, author, year, 0);
    }
    public void deliver(int buyQuantity, String email ) {
        System.out.println("Sorry, Demo Book is not for sale");
    }

}
