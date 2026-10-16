public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle v3 = new Vehicle("Ford", "Ranger", 2015);

        // New methods of v1 - test getters
        System.out.println("Vehicle: 1 (New Method)");
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println();

        // Old methods of v1
        System.out.println("Old method Vehicle: 1");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        // New methods of v2 - test getters
        System.out.println("Vehicle: 2 (New Method)");
        System.out.println("Brand: " + v2.getBrand());
        System.out.println("Model: " + v2.getModel());
        System.out.println("Year: " + v2.getYear());
        System.out.println();

        // Old methods of v2
        System.out.println("Old method Vehicle: 2");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();

        // New methods of v3 - test getters
        System.out.println("Vehicle: 3 (New Method)");
        System.out.println("Brand: " + v3.getBrand());
        System.out.println("Model: " + v3.getModel());
        System.out.println("Year: " + v3.getYear());
        System.out.println();

        // Old methods of v3
        System.out.println("Old method Vehicle: 3");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());

        // Testing setYear()
        System.out.println("\n-- Testing Set --\n");

        boolean set = v1.setYear(2000);
        System.out.println("SetYear: " + set);
        System.out.println("New year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        set = v1.setYear(1885);
        System.out.println("SetYear: " + set);
        System.out.println("Year Remains: " + v1.getYear());
        System.out.println();

        set = v1.setYear(2027);
        System.out.println("SetYear: " + set);
        System.out.println("Year Remains: " + v1.getYear());
        System.out.println();

        // Testing invalid constructor years
        Vehicle invalidV1 = new Vehicle("Testing", "Vehicle 1885", 1885);
        System.out.println("New vehicle with year 1885:");
        System.out.println("Initial year: " + invalidV1.getYear());
        System.out.println();

        Vehicle invalidV2 = new Vehicle("Testing", "Vehicle 2027", 2027);
        System.out.println("New vehicle with year 2027:");
        System.out.println("Initial year: " + invalidV2.getYear());

    }
}
