package school.sorokin.javacore.oop.Task3;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.setYear(1900);
        car.setBrand("Tesla");
        car.setModel("Model 3");

        int year = car.getYear();
        String brand = car.getBrand();
        String model = car.getModel();
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);

        String str = car.toString();

        System.out.println(str);

    }
}
