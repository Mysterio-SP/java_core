package school.sorokin.javacore.oop.Task4;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void calculateArea() {
        System.out.println("area of square");
    }
}
