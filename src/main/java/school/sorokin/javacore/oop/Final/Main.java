package school.sorokin.javacore.oop.Final;

import java.util.Scanner;

public class Main {

    Library library;

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в программу библиотечный каталог!");
        Main self = new Main();
        self.library = new Library();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите один из пунктов меню для продолжения");
            System.out.println("1 - Добавить новую публикацию");
            System.out.println("2 - Вывести список всех публикаций");
            System.out.println("3 - Поиск публикации по автору");
            System.out.println("4 - Вывести общее количество публикаций");
            System.out.println("0 - Выход");

            String inputString = scanner.nextLine().trim();
            if (!inputString.isEmpty()) {
                int typeOfPublication;
                try {
                    typeOfPublication = Integer.parseInt(inputString);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число!");
                    continue;
                }

                switch (typeOfPublication) {
                    case 1:
                        self.handleAddPublication();
                        break;
                    case 2:
                        self.handleListPublications();
                        break;
                    case 3:
                        self.handleFindPublicationByAuthor();
                        break;
                    case 4:
                        self.handleShowNumberOfPublications();
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неизвестная команда");
                        break;
                }
            } else {
                System.out.println("Ничего не введено. Введите заново.");
            }
        }
    }

    private void handleAddPublication() {
        System.out.println("Выберите тип публикации:");
        System.out.println("1 - Book");
        System.out.println("2 - Magazine");
        System.out.println("3 - Newspaper");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().trim();

        if (!inputString.isEmpty()) {
            int typeOfPublication = Integer.parseInt(inputString);

            switch (typeOfPublication) {
                case 1:
                    System.out.println("Ввод данных для книги");
                    String bookTitle = this.inputTitle();
                    String bookAuthor = this.inputAuthor();
                    int bookYear = this.inputYear();
                    String isbn = this.inputISBN();

                    Book book = new Book(bookAuthor, bookTitle, bookYear, isbn);
                    this.library.addPublication(book);
                    System.out.println("Книга успешно добавлена!");

                    break;
                case 2:
                    System.out.println("Ввод данных для журнала");
                    String magazineTitle = this.inputTitle();
                    String magazineAuthor = this.inputAuthor();
                    int magazineYear = this.inputYear();
                    int issueNumber = this.inputIssueNumber();

                    Magazine magazine = new Magazine(magazineAuthor, magazineTitle, magazineYear, issueNumber);
                    this.library.addPublication(magazine);
                    System.out.println("Журнал успешно добавлен!");

                    break;
                case 3:
                    System.out.println("Ввод данных для газеты");
                    String newspaperTitle = this.inputTitle();
                    String newspaperAuthor = this.inputAuthor();
                    int newspaperYear = this.inputYear();
                    String publicationDay = this.inputPublicationDay();

                    Newspaper newspaper = new Newspaper(newspaperAuthor, newspaperTitle, newspaperYear, publicationDay);
                    this.library.addPublication(newspaper);
                    System.out.println("Газета успешно добавлен!");

                    break;
            }

        } else {
            System.out.println("Ничего не введено. Введите заново.");
        }
    }

    private void handleListPublications() {
        this.library.listPublications();
    }

    private void handleFindPublicationByAuthor() {
        System.out.println("Введите имя автора:");
        Scanner scanner = new Scanner(System.in);
        String authorName = scanner.nextLine();
        this.library.searchByAuthor(authorName);
    }

    private void handleShowNumberOfPublications() {
        System.out.println("В данный момент количество публикация равно " + Publication.getPublicationCount());
    }

    private String inputTitle() {
        Scanner scanner = new Scanner(System.in);
        String title;

        do {
            System.out.println("Введите название");
            title = scanner.nextLine().trim();

            if (title.isEmpty()) {
                System.out.println("Название не может быть пустым. Введите заново.");
            }
        } while(title.isEmpty());

        return title;
    }

    private String inputAuthor() {
        Scanner scanner = new Scanner(System.in);
        String author;

        do {
            System.out.println("Введите автора");
            author = scanner.nextLine().trim();

            if (author.isEmpty()) {
                System.out.println("Автор не может быть пустым. Введите заново.");
            }
        } while (author.isEmpty());

        return author;
    }

    private int inputYear() {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        while (true) {
            System.out.println("Введите год");
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                try {
                    year = Integer.parseInt(input);
                    if (year >= 1000) {
                        break;
                    } else {
                        System.out.println("Год не может быть меньше 1000. Введите заново.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка, введите целое число!");
                }
            } else {
                System.out.println("Ничего не введено. Введите заново.");
            }
        }
        return year;
    }

    private String inputISBN() {
        Scanner scanner = new Scanner(System.in);
        String isbn;

        do {
            System.out.println("Введите ISBN");
            isbn = scanner.nextLine().trim();

            if (isbn.isEmpty()) {
                System.out.println("ISBN не может быть пустым. Введите заново.");
            }
        } while (isbn.isEmpty());

        return isbn;
    }

    private int inputIssueNumber() {
        Scanner scanner = new Scanner(System.in);
        int issueNumber = 0;

        while (issueNumber == 0) {
            System.out.println("Введите номер выпуска");
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                try {
                    issueNumber = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка, введите целое число!");
                    continue;
                }
            } else {
                System.out.println("Ничего не введено. Введите заново.");
            }
        }
        return issueNumber;
    }

    private String inputPublicationDay() {
        Scanner scanner = new Scanner(System.in);
        String publicationDay;

        do {
            System.out.println("Введите день публикации");
            publicationDay = scanner.nextLine().trim();

            if (publicationDay.isEmpty()) {
                System.out.println("День публикации не может быть пустым. Введите заново.");
            }
        } while (publicationDay.isEmpty());

        return publicationDay;
    }
}
