package functions;

public class FunctionExample01 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println(RandomNumber());
        System.out.println(FunctionExample02.Addnumbers(0, 8));
    }

    public static int RandomNumber() {
        return 4;
    }



}

// another class here 

class FunctionExample02 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }

    public static int Addnumbers ( int x, int y) {
        return x + y;
    }

}
