package arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // create an aray of integers
        int[] numbers = new int[5];
        // array of strings
        String[] names = new String[5];
        // array of doubles
        double[] values = new double[5];
        // mixed array 
        Object[] objects = new Object[5];

        // assign values to the array
        numbers[0] = 1;
        names[0] = "John";
        values[0] = 1.0;
        objects[0] = 1;
        objects[1] = "John";
        objects[2] = 1.0;
        objects[3] = true;

        for (int number : numbers) {
            System.out.println(number);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (double value : values) {
            System.out.println(value);
        }

        for (Object object : objects) {
            System.out.println(object);
        }
        
        
    }
    
}
