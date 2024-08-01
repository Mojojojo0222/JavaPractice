package day2.lbrarymanagement;
public class Books extends LibraryItem  {
    private String isbn;
    private String id;
    private boolean available;

    // Constructor
    public Books(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
        this.available = true; // Books are available by default
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter for ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Available: " + isAvailable());
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void checkOut() {
        if (available) {
            available = false;
            System.out.println("Book checked out.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("Book returned.");
    }
}
