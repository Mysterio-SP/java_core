package school.sorokin.javacore.basics;

public class Task2 {

    public static void main(String[] args) {

        byte grade1 = 4;
        byte grade2 = 8;
        byte grade3 = 1;

        double avg = (grade1 + grade2 + grade3) / 3.0;

        System.out.println("Средняя оценка равна " + avg);

        if(grade1 == 10 && grade2 == 10 && grade3 == 10) {
            System.out.println("У студента все оценки максимальные!");
        }

        if(grade1 < 2 || grade2 < 2 || grade3 < 2) {
            System.out.println("Встречается очень низкая оценка!");
        }

        if(avg >= 5) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println("У студента неудовлетворительная успеваемость");
        }

        if(grade1 < 0 || grade1 > 10 || grade2 < 0 || grade2 > 10 || grade3 < 0 || grade3 > 10) {
            System.out.println("Ошибка: некорректная оценка!");
        }
    }
}
