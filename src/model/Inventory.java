package model;

import java.util.ArrayList;
import Services.InventoryService;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
        System.out.println("Added Book: " + book.getTitle());
    }

    public ArrayList<Book> removeOutdatedBooks(int maxYears) {
        ArrayList<Book> outdatedBooks = new ArrayList<>();
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (InventoryService.isoutdated(book.getYear(), maxYears)) {
                System.out.println("Removed Book: " + book.getTitle() + " Published at " + book.getYear());
                iterator.remove();
                outdatedBooks.add(book);
            }
        }

        return outdatedBooks;
    }

    public void BuyBook(String ISBN , int quantity , String Email){
        boolean found = false;
        for(Book book : books) {
            if(book.getISBN().equals(ISBN)) {
                found = true;
                book.deliver(quantity,Email);
            }
        }
        if(found == false) {
            System.out.println("Sorry, Your ISBN does not exist");
        }
    }
}
