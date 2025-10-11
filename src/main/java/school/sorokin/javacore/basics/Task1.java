package school.sorokin.javacore.basics;

public class Task1 {

    public static void main(String[] args) {

        byte byteMaxNumber = 127;
        System.out.println("Максимальное значение числа с типом byte равно " + byteMaxNumber);

        short shortMaxNumber = 32767;
        System.out.println("Максимальное значение числа с типом short равно " + shortMaxNumber);

        int intMaxNumber = 2147483647;
        System.out.println("Максимальное значение числа с типом int равно " + intMaxNumber);

        long longNumber = 9L;
        System.out.println("Пример переменной с типом longMaxNumber равно " + longNumber);

        float floatPi = 3.14f;
        System.out.println("Число Пи из переменной с типом float равно " + floatPi);

        double myTemperature = 36.6;
        System.out.println("Моя текущая температура из переменной с типом double равна " + myTemperature);

        boolean boolTrueValue = true;
        System.out.println("Истина из переменной с типом boolean равна " + boolTrueValue);

        char charExampleValue = 'a';
        System.out.println("Пример символа из переменной с типом char " + charExampleValue);


        int intFromLong = (int) longNumber;
        System.out.println("Вторая переменная с типом int из типа long " + intFromLong);

        int intFromChar = (int) charExampleValue;
        System.out.println("Третья переменная с типом int из типа char " + intFromChar);

        char charSecondExampleValue = 'b';
        int secondIntFromChar = (int) charSecondExampleValue;
        System.out.println("Четвертая переменная с типом int из типа char " + secondIntFromChar);


    }



}
