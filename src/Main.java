public class Main{
    public static void main(String[] args){
        Driver driver = new Driver("Mark", "ABC123");

        Car car = new Car("Toyota", 2014, 4, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Yamaha", 2020, false);
        Truck truck = new Truck("BMW", 2017, 12.5, 4);

        car.setDriver(driver);
        motorcycle.setDriver(driver);
        truck.setDriver(driver);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            }

            v.stopEngine();
            System.out.println("-------------------");
        }

    }
}
