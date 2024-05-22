
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", "S90", 2005, 204532, 20453.2);
        System.out.println(car.getMake()+" "+ car.getModel()+" fuel consumption: " +car.calculateFuelEfficiency()+" gallons");
        Truck truck = new Truck("Volvo", "FL", 2010, 500000, 100000,11.9);
        System.out.println(truck.calculateFuelEfficiency());

    }
}