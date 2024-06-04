package W14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "123456789", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "192837465", 1925);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("All books in the library:");
        Vector<Book> allBooks = library.listAllBooks();
        for (int i = 0; i < allBooks.size(); i++) {
            System.out.println(allBooks.get(i));
        }

        library.borrowBook("123456789");
        System.out.println("\nBorrowed book with ISBN 123456789");

        System.out.println("\nAll borrowed books:");
        ArrayList<Book> borrowedBooks = library.listAllBorrowedBooks();
        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.println(borrowedBooks.get(i));
        }

        library.returnBook("123456789");
        System.out.println("\nReturned book with ISBN 123456789");

        System.out.println("\nAll borrowed books after returning:");
        borrowedBooks = library.listAllBorrowedBooks();
        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.println(borrowedBooks.get(i));
        }

        Book searchResult = library.searchBookByTitle("1984");
        System.out.println("\nSearch result for title '1984':");
        System.out.println(searchResult);
    }
}
