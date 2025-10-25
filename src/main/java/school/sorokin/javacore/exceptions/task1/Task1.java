package school.sorokin.javacore.exceptions.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");

        int firstNumber = 0;
        int secondNumber = 0;
        try {
            firstNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число! Завершение работы программы.");
            System.out.println("Спасибо за использование программы!");
            return;
        }

        System.out.println("Введите второе число");

        try {
            secondNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число! Завершение работы программы.");
            System.out.println("Спасибо за использование программы!");
            return;
        }

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Результат деления равен: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль! Пожалуйста, попробуйте другое число!");
        } finally {
            System.out.println("Спасибо за использование программы!");
        }
    }
}
