package school.sorokin.javacore.oop.Final;

import java.util.*;

public class Library {
    private List<Publication> publications;

    Library() {
        this.publications = new ArrayList<>();
    }

    public void addPublication(Publication pub) {
        publications.add(pub);
        Publication.increasePublicationCount();
    }

    public void listPublications() {

        if(publications.isEmpty()) {
            System.out.println("Список публикация пуст.");
            return;
        }

        for (Publication publication : publications) {
            System.out.println(publication.toString());
        }
    }

    public void searchByAuthor(String author) {
        System.out.println(author);
        if (author.isEmpty()) {
            System.out.println("Введено пустое значение поиска для поля Автор. Поиск отменен.");
            return;
        }

        for (Publication publication : publications) {
            if (publication.getAuthor().equals(author)) {
                System.out.println("Найдена следующая публикация с автором " + author + ":");
                System.out.println(publication.toString());
                return;
            }
        }

        System.out.println("Публикация с автором " + author + " не найдена.");
    }
}
