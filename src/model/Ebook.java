package model;

public class Ebook extends Book implements ElectronicBooks {
    private String FileType;
    public Ebook(String title, String author, int year, double price, String FileType) {
        super(title, author, year, price);
        this.FileType = FileType;
    }
    public String getFileType() {
        return FileType;
    }
    public void deliver(int buyQuantity, String email ) {
        System.out.println("EBook sent to: " + email);
    }
}

