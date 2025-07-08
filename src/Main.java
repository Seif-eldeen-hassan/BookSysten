import model.*;
import Services.*;
public class Main {
    public static void main(String[] args) {
        Book book1 = new PaperBook("ISBN101", "The Pragmatic Programmer", 2001, 450.0, 10);
        Book book2 = new Ebook("ISBN202", "Clean Architecture", 2017, 320.0 , "PDF");
        Book book3 = new Ebook("ISBN212", "JavaLearn", 2010, 200 , "PDF");
        Book book4 = new DemoBook("ISBN303", "Sample Java Reference", 2023);
        Book book5 = new PaperBook("ISBN125", "The Pragmatic Programmer", 2024, 600.0, 6);

        System.out.println("-------------------- 1) Adding Books To Inventory -----------------------");
        Inventory inventory = new Inventory();
        inventory.add(book1);
        inventory.add(book2);
        inventory.add(book3);
        inventory.add(book4);
        inventory.add(book5);
        System.out.println();

        System.out.println("-------------------- 2) Removing Outdated Books -----------------------");
        inventory.removeOutdatedBooks(12);
        System.out.println();

        System.out.println("-------------------- 3) Buying Books -----------------------");
        inventory.BuyBook("ISBN202",5,"Seifeldeen568@gmail.com");   //Buying Ebook
        inventory.BuyBook("ISBN125",2,"Seifeldeen9872@gmail.com");  // Buying Paperbook
        inventory.BuyBook("ISBN303",2,"Seifeldeen9872@gmail.com");   //Buying Demo Book
        System.out.println();

        System.out.println("-------------------- 4) Searching for wrong ISBN -----------------------");
        inventory.BuyBook("ISBN9000",2,"Seifeldeen9872@gmail.com");
        System.out.println();

        System.out.println("-------------------- 5) Buying Paper Books More than the stock -----------------------");
        inventory.BuyBook("ISBN125",90,"Seifeldeen9872@gmail.com");
    }
}