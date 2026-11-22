public class Main6 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Car("Toyota", 2019, 180, 4),
                new Truck("MAN", 2015, 110, 10000),
                new Bicycle("Giant", 2022, 40)
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.move();
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.load(12000);
                truck.load(8000);
            }
        }
    }
}