package school.sorokin.javacore.oop.Task7;

public class Book {

    String title;

    String author;

    public String toString() {
        return "Book{'title' = " + title + "; 'author' = " + author + '}';
    }

    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return this.title == book.title && this.author == book.author;
    }
     @Override
    public int hashCode() {
        return 55;
    }
}
