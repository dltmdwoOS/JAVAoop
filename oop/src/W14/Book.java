package W14;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int year;

    public Book(String title, String author, String ISBN, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    public String getTitle(){ return this.title; }
    public String getAuthor(){ return this.author; }
    public String getISBN(){ return this.ISBN; }
    public int getYear(){ return this.year; }

    public void setTitle(String title){ this.title = title; }
    public void setAuthor(String author){ this.author = author; }
    public void setISBN(String ISBN){ this.ISBN = ISBN; }
    public void setYear(int year){ this.year = year; }

    @Override
    public String toString() {
        return "Book{" + "title=\'" + this.title + "\'" + ", author=\'" + this.author + "\'" + ", ISBN=\'" + this.ISBN + "\'" + ", year=" + this.year + "}";
    }
}