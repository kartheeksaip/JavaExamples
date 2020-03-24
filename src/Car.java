import java.util.UUID;

public class Car {
    public String wheels;
    public String year;
    public String color;

    public Car() {
    }

    public Car(String wheels, String year, String color) {
        this.wheels = wheels;
        this.year = year;
        this.color = color;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCurrentName() {
        return "ABCD"+UUID.randomUUID().toString();
    }
}
