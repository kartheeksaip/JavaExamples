public class JavaExamples {
    public static void main(String[]  args) {
        // Created a Object of type car
        //Car car = new Car("4", "2020", "Red");
        //car.setColor("Black");

        //Created a Object of type BMW
        BMW b = new BMW("AP 5678", "2019", "Black");

        Toyota t = new Toyota("TS 1234", "2020", "White");

        System.out.println("Toyota= Wheels: "
                + t.wheels + " Year: " + t.year + " Color: " + t.color + " Plate: " + t.plate+ " Name: "+ t.name);
        System.out.println("BMW= Wheels: "
                + b.wheels + " Year: " + b.year + " Color: " + b.color + " Number Tag: " + b.numberTag+ " Name: "+b.name);

    }
}
