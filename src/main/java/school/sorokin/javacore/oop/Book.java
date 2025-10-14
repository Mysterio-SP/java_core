package school.sorokin.javacore.oop;

public class Book {

    String title;
    String author;
    int pages;

    public void read() {
        System.out.println("Вы читаете книгу ‘" + title + "’ авторства " + author + ".");
    }
}
