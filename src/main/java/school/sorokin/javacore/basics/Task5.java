package school.sorokin.javacore.basics;

import java.util.Random;


public class Task5 {
    public static void main(String[] args) {

        int [] randomNumbers = new int[10];

        Random random = new Random();

        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
            System.out.println(randomNumbers[i]);
        }

        int minValue = randomNumbers[0];
        int maxValue = randomNumbers[0];

        for(int i = 0; i < randomNumbers.length; i++) {
            int currentValue = randomNumbers[i];

            if(currentValue < minValue) {
                minValue = currentValue;
            }

            if(currentValue > maxValue) {
                maxValue = currentValue;
            }
        }

        System.out.println("Минимальное значение равно " + minValue);
        System.out.println("Максимальное значение равно " + maxValue);


        for(int i = 0; i < randomNumbers.length - 1; i++) {
            for (int j = 0; j < randomNumbers.length - 1 - i; j++) {

                if(randomNumbers[j] > randomNumbers[j + 1]) {

                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Отсортированный массив: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }


        int[][] doubleArr = new int[2][5];

        for (int i = 0; i < doubleArr.length; i++) {

            for (int j = 0; j < doubleArr[i].length; j++) {
                doubleArr[i][j] = random.nextInt(100);
            }
        }

        System.out.println();
        System.out.println("Двумерный массив 2×5:");
        System.out.println("-------------------");
        for (int i = 0; i < 2; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", doubleArr[i][j]);
            }
            System.out.println();
        }



    }
}
