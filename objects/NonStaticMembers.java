package objects;

public class NonStaticMembers {
    int num;

    NonStaticMembers() {
        System.out.println("Constructor called");
    }

    {
        System.out.println("Instance block called");
    }

    static {
        System.out.println("Static block called");
    }

   public static void main(String[] args) {
       System.out.println("Main called");
       NonStaticMembers obj = new NonStaticMembers();
       System.out.println(obj.num);
   }
}
