package objects;

public class ThiskeyWordDemo {

    int x;

    ThiskeyWordDemo() {
        System.out.println("Constructor called");
        System.out.println(this);
        System.out.println(this.x);

    }

    
    public static void main(String[] args) {
        new ThiskeyWordDemo();
        new ThiskeyWordDemo();
        ThiskeyWordDemo obj = new ThiskeyWordDemo();
        obj.doSomething();
    }

    static void init () {
        System.out.println("Static block called");
    }

    {
        System.out.println("Instance block called");
    }

    void doSomething() {
        System.out.println("doSomething called");
    }
}
