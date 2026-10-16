public class Vehicle {

    private String brand;
    private String model;
    private int year;

    // Constructor
    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;

        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Set year with validation
    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }

        return false;
    }

    // Original method
    void displayInfo() {
        System.out.println(brand + " " + model + " " + year);
    }

    // Original method
    int calculateAge() {
        return 2026 - year;
    }

    // Original method
    boolean isVintage() {
        return calculateAge() > 25;
    }
}