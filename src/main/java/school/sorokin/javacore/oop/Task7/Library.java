package school.sorokin.javacore.oop.Task7;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "Sergey";
        book1.title = "Test 1 book name.";

        Book book2 = new Book();
        book2.author = "Sergey";
        book2.title = "Test 2 book name.";

        boolean areBooksEquals = book1.equals(book2);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(areBooksEquals);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
