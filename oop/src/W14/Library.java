package W14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Library {
    private Vector<Book> books;
    private ArrayList<Book> borrowedBooks;
    private HashMap<String, Book> bookMap;

    public Library() {
        this.books = new Vector<Book>();
        this.borrowedBooks = new ArrayList<Book>();
        this.bookMap = new HashMap<String, Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
        this.bookMap.put(book.getISBN(), book);
    }

    public void borrowBook(String ISBN) {
        Book borrow = this.bookMap.get(ISBN);
        this.borrowedBooks.add(borrow);
    }

    public void returnBook(String ISBN) {
        Book borrow = this.bookMap.get(ISBN);
        this.borrowedBooks.remove(borrow);
    }

    public Book searchBookByTitle(String title) {
        int index = 0;
        for (int i = 0 ; i<this.books.size(); i++){
            if (this.books.get(i).getTitle().equals(title)){
                index = i;
                break;
            }
        }
        return this.books.get(index);
    }

    public Vector<Book> listAllBooks() {
        return this.books;
    }

    public ArrayList<Book> listAllBorrowedBooks() {
        return this.borrowedBooks;
    }
}