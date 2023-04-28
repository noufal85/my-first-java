package exploration;
import java.lang.reflect.*;
import java.lang.reflect.*;

public class GetMethodNames {
  public void method1() {}
  public int method2(String str) { return str.length(); }
  private void method3() {}

  public static void main(String[] args) {
    Class<?> myClass = GetMethodNames.class;
    Method[] methods = myClass.getDeclaredMethods();

    System.out.println("Methods in " + myClass.getName() + ":");
    for (Method method : methods) {
      System.out.println("- " + method.getName());
    }
  }
}