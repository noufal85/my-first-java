public class LogicalOperators {

    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        int z = 10;
        String str = "John";
        String str2 = "John";
        Boolean isJavaFun = true;

        // java logical operators are &&, ||, and !

        
        if (x > y  & z == 10) {
            System.out.println("x is greater than y and z is 10");
        }
        if (x == y || z == 10) {
            System.out.println("x is equal to y or z is equal to 10");
        }
        if (x > y & z != 11) {
            System.out.println("checking not condition");
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
