package school.sorokin.javacore.oop;

public class Task1 {

    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Марк Твен";
        book.title = "Приключения Тома Сойера";

        book.read();
    }
}
