package school.sorokin.javacore.basics;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputValue = scanner.nextLine();

        System.out.println("Введенная строка: " + inputValue);
        System.out.println("Длина введенной строки: " + inputValue.length());
        System.out.println("Введенная строка в верхнем регистре: " + inputValue.toUpperCase());

        if(inputValue.contains("Java")) {
            System.out.println("Индекс первого вхождения слова Java - " + inputValue.indexOf("Java") );
        } else {
            System.out.println("Слово Java отсутствует в введенной строке");
        }

        String[] words = inputValue.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
