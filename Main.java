public class Main {
    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2024, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Super Cub", 1958, "Gas");
        Truck truck = new Truck("Mercedes-AMG", "G 63 6x6", 2013, 6);
        Printer printer = new Printer();

        System.out.println("=== Serviceable Array ===");
        Serviceable[] serviceables = { car, motorcycle, truck, printer };
        for (Serviceable item : serviceables) {
            performService(item);
        }

        System.out.println("\n=== Vehicle Array ===");
        Vehicle[] vehicles = { car, motorcycle, truck };
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.moveForward();
            v.moveBackwards();
            v.moveLeft();
            v.moveRight();
            System.out.println();
        }
    }
}
