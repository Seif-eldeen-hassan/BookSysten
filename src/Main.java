import model.*;
import Services.*;
public class Main {
    public static void main(String[] args) {
        Book book1 = new PaperBook("ISBN101", "The Pragmatic Programmer", 2001, 450.0, 10);
        Book book2 = new Ebook("ISBN202", "Clean Architecture", 2017, 320.0 , "PDF");
        Book book3 = new Ebook("ISBN212", "JavaLearn", 2010, 200 , "PDF");
        Book book4 = new DemoBook("ISBN303", "Sample Java Reference", 2023);

        System.out.println("--------------------------------------------------------");
        Inventory inventory = new Inventory();
        inventory.add(book1);
        inventory.add(book2);
        inventory.add(book3);
        inventory.add(book4);
        System.out.println("--------------------------------------------------------");
        // Testing Removing Outdated Books
        inventory.removeOutdatedBooks(12);
        System.out.println("--------------------------------------------------------");
        
        // Buy Book
        inventory.BuyBook("ISBN202",5,"Seifeldeen568@gmail.com");

    }
}