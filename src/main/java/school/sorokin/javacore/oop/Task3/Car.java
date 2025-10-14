package school.sorokin.javacore.oop.Task3;

public class Car {

    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1886) {
            System.out.println("Ошибка при установке года!");
        }

        this.year = year;
    }

    @Override
    public String toString() {
        return "car{brand=" + brand + ", model=" + model + ", year=" + year + "}";
    }
}
