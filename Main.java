public class main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Toyota", "Camry", 2024, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Honda", "Super Cub", 1958, "Gas");
        vehicle.displayInfo();
        System.out.println();

        System.out.println("=== 2. Method Parameter ===");
        Car car = new Car("Porsche", "Taycan", 2026, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 400 / 500", 2018, "Gas");
        Truck truck = new Truck("Mercedes-AMG", "G 63 6x6", 2013, 6);      

        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);

        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Mazda", "Civic Type R", 2026, 5),
            new Motorcycle("Ducati", "Panigale V4", 2018, "Gas"),
            new Truck("Ram", "DRW", 2003, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}