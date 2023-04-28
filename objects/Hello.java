package objects;

public class Hello {

    static int num;
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("From Main");
        Hello.method1();
        System.out.println(Hello.num);
    }

    static  {
        System.out.println("Hello, STATIC!");
        System.out.println("This get executed before main .. Interesting ");
    }

    static void method1() {
        System.out.println("Hello, method1!");
    }
    
}
