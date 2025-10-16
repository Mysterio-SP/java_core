package school.sorokin.javacore.oop.Task4;

public class Canvas {
    public static void main(String[] args) {

        Shape[] shapes = { new Circle(), new Square(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw();

            shape.calculateArea();
        }


    }
}
