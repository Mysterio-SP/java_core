package school.sorokin.javacore.oop.Task4;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void calculateArea() {
        System.out.println("area of triangle");
    }
}
