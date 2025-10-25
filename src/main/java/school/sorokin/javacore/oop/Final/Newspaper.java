package school.sorokin.javacore.oop.Final;

import java.util.Objects;

public class Newspaper extends Publication implements Printable {

    private String publicationDay;

    Newspaper(String aurhor, String title, int year, String publicationDay) {
        super(aurhor, title, year);
        this.publicationDay = publicationDay;
    }

    public String getType() {
        return "Newspaper";
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }

    public void printDetails() {
        System.out.println("Details about Newspaper");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{title='" + this.getTitle() + "', author='" + this.getAuthor() + "', year=" + this.getYear() + ", publicationDay='" + this.getPublicationDay() + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.getAuthor(), this.getYear(), this.getPublicationDay());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Newspaper newspaper = (Newspaper) obj;

        return this.getAuthor().equals(newspaper.getAuthor())  &&
                this.getTitle().equals(newspaper.getTitle()) &&
                this.getYear() == newspaper.getYear() &&
                this.getPublicationDay().equals(newspaper.getPublicationDay());
    }

}
