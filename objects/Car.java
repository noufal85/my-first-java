package objects;

public class Car {
    String color;
    String brand;
    int numberOfDoors;
    boolean isRunning;
    int year;
    private String model;
    public int msrp;

    //  add a constructor 
    public Car(String color, String brand, int numberOfDoors, boolean isRunning, int year) {
        this.color = color;
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
        this.isRunning = isRunning;
        this.year = year;
        this.msrp = getMsrp();
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", brand=" + brand + ", numberOfDoors=" + numberOfDoors + ", isRunning="
                + isRunning + ", year=" + year + ", model=" + model + "]";
    }
    
    public int getMsrp() {
        // return 10000;

        switch (this.brand) {
            case "Toyota":
                return 10000;
            case "Honda":
                return 20000;
            case "Ford":
                return 30000;
            default:
                return 500;
        }
    }

}


