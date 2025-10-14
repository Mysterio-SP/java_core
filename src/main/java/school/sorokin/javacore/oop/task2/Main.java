package school.sorokin.javacore.oop.task2;

public class Main {
    public static void main(String[] args) {

        int first = 5;

        boolean second = true;

        double third = 36.6;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        Person person = new Person();
        person.age = 50;


        System.gc();
        Main self = new Main();
        self.changePrimitive(first);

        System.out.println(first);

        self.changeObject(person);
        System.out.println(person.age);
    }


    private void changePrimitive(int intExample) {
        intExample = intExample + 5;

        System.out.println(intExample);
    }

    private void changeObject(Person person) {
        person.age = 18;
    }
}
