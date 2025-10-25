package school.sorokin.javacore.exceptions.task2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Task2 task2 = new Task2();
        task2.createFile();
        task2.checkArray();
    }

    private void createFile() {
        System.out.println("Введите имя файла:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println(fileName);
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Не удалось создать файл");
        }
    }

    private void checkArray() {
        System.out.println("Проверка индека массива");
        int arr[] = new int[3];

        try {
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException   e) {
            System.out.println("Не удалось получить элемент массива ");
        } catch (Throwable   e) {
            System.out.println("Не удалось получить элемент массива 2");
        }
    }
}
