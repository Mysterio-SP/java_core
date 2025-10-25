package school.sorokin.javacore.oop.Final;

import java.util.Objects;

public class Magazine extends Publication implements Printable {

    private int issueNumber;

    Magazine(String aurhor, String title, int year, int issueNumber) {
        super(aurhor, title, year);
        this.issueNumber = issueNumber;
    }

    public String getType() {
        return "Magazine";
    }

    public int getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void printDetails() {
        System.out.println("Details about Magazine");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{title='" + this.getTitle() + "', author='" + this.getAuthor() + "', year=" + this.getYear() + ", issueNumber='" + this.getIssueNumber() + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.getAuthor(), this.getYear(), this.getIssueNumber());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
           return false;
        }

        Magazine magazine = (Magazine) obj;

        return this.getAuthor().equals(magazine.getAuthor())  &&
                this.getTitle().equals(magazine.getTitle()) &&
                this.getYear() == magazine.getYear() &&
                this.getIssueNumber() == magazine.getIssueNumber();
    }
}
