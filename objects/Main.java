package objects;

public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car(
            "red",
            "Toyota",
            4,
            true,
            2020
        );
        // car1.color = "red";
        // car1.brand = "Toyota";
        // car1.numberOfDoors = 4;

        // Car car2 = new Car();
        // car2.color = "blue";

        System.out.println(car1);
        // System.out.println(car2);

        car1.brand = "Honda";

        System.out.println(car1);

        car1.setModel("Civic");

        System.out.println(car1);

        Car car2 = new Car(
            "blue",
            "Honda",
            4,
            true,
            2020
        );

        Car car3 = new Car(
            "blue",
            "BMW",
            4,
            true,
            2020
        );

        System.out.println(car2.getMsrp());
        System.out.println(car1.msrp);
        System.out.println(car3.msrp);

        Car car4 = car2;
        System.out.println(car3);






    }

   
    
}
