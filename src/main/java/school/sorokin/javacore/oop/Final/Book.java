package school.sorokin.javacore.oop.Final;

import java.util.Objects;

public class Book extends Publication implements Printable {

    private String ISBN;
    Book(String aurhor, String title, int year, String ISBN) {
        super(aurhor, title, year);
        this.ISBN = ISBN;
    }
    public String getType() {
        return "Book";
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void printDetails() {
        System.out.println("Details about Book");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{title='" + this.getTitle() + "', author='" + this.getAuthor() + "', year=" + this.getYear() + ", ISBN='" + this.getISBN() + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.getAuthor(), this.getYear(), this.getISBN());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return this.getAuthor().equals(book.getAuthor())  &&
                this.getTitle().equals(book.getTitle()) &&
                this.getYear() == book.getYear() &&
                this.getISBN().equals(book.getISBN());
    }
}
