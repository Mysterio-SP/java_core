package school.sorokin.javacore.basics;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Выберите фильм от 1 до 5: ");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();


        if(choose < 1 || choose > 5) {
            System.out.println("Введено неверное число!");
        } else {
            switch (choose) {
                case 1:
                    System.out.println("Вы выбрали боевик, рассмотрите варинт Неудержимые!");
                    break;
                case 2:
                    System.out.println("Вы выбрали комедию, рассмотрите варинт Брюс всемогущий!");
                    break;
                case 3:
                    System.out.println("Вы выбрали ужасы, рассмотрите варинт Астрал!");
                    break;
                case 4:
                    System.out.println("Вы выбрали мелодрамму, рассмотрите варинт Пассажиры!");
                    break;
                case 5:
                    System.out.println("Вы выбрали исторический жанр, рассмотрите варинт Брессткая крепость!");
                    break;
            }
        }

    }
}
