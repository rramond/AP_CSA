package sandbox;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public ArrayList<Book> booksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equals(author))
                result.add(books.get(i));
        }
        return result;
    }

    public boolean removeFirstByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Dune", "Herbert");
        lib.addBook("Foundation", "Asimov");
        lib.addBook("Hyperion", "Simmons");
        lib.addBook("I, Robot", "Asimov");

        System.out.println("Books by Asimov:");
        ArrayList<Book> asimovBooks = lib.booksByAuthor("Asimov");
        for (Book b : asimovBooks) {
            System.out.println("  " + b.getTitle() + " — " + b.getAuthor());
        }

        System.out.println("\nRemoving 'Dune': " + lib.removeFirstByTitle("Dune"));
        System.out.println("Removing 'Nonexistent': " + lib.removeFirstByTitle("Nonexistent"));

        System.out.println("\nAll books after removal:");
        for (Book b : lib.getBooks()) {
            System.out.println("  " + b.getTitle() + " — " + b.getAuthor());
        }
    }
}


class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}