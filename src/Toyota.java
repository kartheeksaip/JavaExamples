public class Toyota extends Car {
    public String plate;
    public  String name;

    public Toyota(String plate, String year, String color) {
        super("4", year, color);
        this.plate = plate;
        this.name = super.getCurrentName();
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
