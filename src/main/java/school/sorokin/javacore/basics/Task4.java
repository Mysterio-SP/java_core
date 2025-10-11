package school.sorokin.javacore.basics;

public class Task4 {
    public static void main(String[] args) {

        for(int i = 3; i < 100; i = i+3) {
            System.out.println(i);
        }

        int counter = 10;
        while(counter >= 0) {
            System.out.println(counter);
            counter--;
        }


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int value = i * j;

                if(value > 30) {
                    break;
                }

                System.out.println(i + " * " + j + " = " + value);
            }
        }
    }
}
