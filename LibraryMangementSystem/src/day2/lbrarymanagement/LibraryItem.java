package day2.lbrarymanagement;
public abstract class LibraryItem {
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    public abstract void displayInfo();

    // Method to check if the item is available
    public abstract boolean isAvailable();

    // Method to check out the item
    public abstract void checkOut();

    // Method to return the item
    public abstract void returnItem();
}
