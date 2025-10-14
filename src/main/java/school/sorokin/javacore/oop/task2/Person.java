package school.sorokin.javacore.oop.task2;

public class Person {

    int age;

    String name;


    public void finalize() {
        System.out.println("Из метода файналайз");
    }
}
