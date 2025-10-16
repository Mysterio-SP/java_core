package school.sorokin.javacore.basics;

import java.util.Scanner;

public class ContactsSystem {

    private static int MAX_CONTACTS = 100;
    String[] names;
    String[] phoneNumbers;
    int contactCount;

    public ContactsSystem() {
        this.names = new String[MAX_CONTACTS];
        this.phoneNumbers = new String[MAX_CONTACTS];
        this.contactCount = 0;
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в систему учета контактов!");
        ContactsSystem currentObject = new ContactsSystem();
        while (true) {
            int userInput = currentObject.showMenu();
            if (!currentObject.handleUserInput(userInput)) {
                break;
            }
        }
    }

    private int showMenu() {
        System.out.println("Введите число из указанных ниже для продолжения:");
        System.out.println("1. Добавить контакт");
        System.out.println("2. Просмотреть контакты");
        System.out.println("3. Найти контакт");
        System.out.println("4. Удалить контакт");
        System.out.println("5. Выйти");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if(input < 1 || input > 5) {
                    scanner.nextLine();
                }
                return input;
            } else {
                scanner.nextLine();
                return 0;
            }
        }
    }

    private boolean handleUserInput(int userInput) {
        switch (userInput) {
            case 1:
                this.handleAddContact();
                break;
            case 2:
                this.handleShowContacts();
                break;
            case 3:
                this.handleFindContact();
                break;
            case 4:
                this.handleDeleteContact();
                break;
            case 5:
                this.handleQuitProgram();
                return false;
            default:
                System.out.println("Ошибка! Пожалуйста, введите целое число от 1 до 5 включительно:");
        }
        return true;
    }

    private void handleAddContact() {
        if(contactCount >= MAX_CONTACTS) {
            System.out.println("Ошибка! Превышено допустимое количество контактов!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя контакта:");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Ошибка! Имя не может быть пустым!");
            return;
        }
        System.out.println("Введите номер контакта:");
        String number = scanner.nextLine().trim();
        if (number.isEmpty()) {
            System.out.println("Ошибка! Номер не может быть пустым!");
            return;
        }

        this.names[this.contactCount] = name;
        this.phoneNumbers[this.contactCount] = number;
        this.contactCount++;
        System.out.println("Контакт " + name + " с номером " + number + " успешно добавлен!");
        System.out.println("-----");

    }

    private void handleShowContacts() {
        System.out.println("-----");
        System.out.println("Список контактов:");
        for (int i = 0; i < contactCount; i++) {
            System.out.println(i + 1 + ". " + names[i] + " - " + phoneNumbers[i]);
        }
        System.out.println("-----");
    }

    private void handleFindContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя для поиска:");
        String nameToFind = scanner.nextLine();

        for(int i = 0; i < this.names.length; i++) {
            if(this.names[i] != null && this.names[i].equals(nameToFind) ) {
                System.out.println("Телефон " + this.names[i] + ": " + this.phoneNumbers[i]);
                return;
            }
        }

        System.out.println("Контакт с именем " + nameToFind + " не найден!");
    }

    private void handleDeleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для удаления:");
        String nameToDelete = scanner.nextLine();

        for (int i = 0; i < this.names.length; i++) {
            if(this.names[i] != null && this.names[i].equals(nameToDelete) ) {

                for (int j = i; j < this.contactCount - 1; j++) {
                    this.names[j] = this.names[j + 1];
                    this.phoneNumbers[j] = this.phoneNumbers[j + 1];
                }

                this.names[this.contactCount - 1] = null;
                this.phoneNumbers[this.contactCount - 1] = null;
                this.contactCount--;
                System.out.println("Контакт " + nameToDelete + " удалён!");
                return;
            }
        }
        System.out.println("Контакт " + nameToDelete + " не найден!");
    }

    private void handleQuitProgram() {
        System.out.println("Выход из программы.");
    }
}
