package school.sorokin.javacore.oop.Final;

import java.util.Objects;

public abstract class Publication {

    private  String title;
    private String author;
    private int year;
    private static int publicationCount = 0;

    public abstract String getType();

    Publication(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
         return title;
    }

    public void setTitle(String title) {
         this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public int getYear() {
         return year;
    }

    public void setYear(int year) {
         this.year = year;
    }

    public static int getPublicationCount() {
        return publicationCount;
    }

    public static void increasePublicationCount() {
        publicationCount++;
    }

    public static void decreasePublicationCount() {
        publicationCount--;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{title='" + this.getTitle() + "', author='" + this.getAuthor() + "', year=" + this.getYear() + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.getAuthor(), this.getYear());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
