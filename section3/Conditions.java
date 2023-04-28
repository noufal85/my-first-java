public class Conditions {
    
    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        String str = "John";
        String str2 = "John";
        Boolean isJavaFun = true;

        
        if (x > y) {
            System.out.println("x is greater than y");
        }
        if (x == y) {
            System.out.println("x is equal to y");
        }
        if (x < y) {
            System.out.println("x is less than y");
        }

        if (x == 10 & y > 9) {
            System.out.println("x is equal to 10");
        }
        else {
            System.out.println("x is not equal to 10");
        }

        // string comparison 

        if (str.equals(str2)) {
            System.out.println("str is equal to the other string");

        }
        
        if (isJavaFun) {
            System.out.println("Java is fun");
        }
        else {
            System.out.println("Java is not fun");
        }
    }
}
