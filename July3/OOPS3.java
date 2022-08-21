import java.io.*;
import java.util.*;

class OOPS3
 {
  
  static class P {
    int d = 1;
    int d1 = 10;

    void fun(){
        System.out.println("P fun");
    }

    void fun1(){
        System.out.println("P fun1");
    }
  }

  static class C extends P {
    int d = 2;
    int d2 = 20;

    void fun(){
        System.out.println("C fun");
    }

    void fun2(){
        System.out.println("C fun2");
    }
  }
  
  
    
  public static void main(String[] args) throws NumberFormatException, IOException {
      // case 2 => P and C
      P obj = new C();
      System.out.println(obj.d); // conflict (object has P.d and C.d, resolved by ref -> P)
      System.out.println(obj.d1); // available only in P
    //   System.out.println(obj.d2); // not allowed, because compiler doesn't allow it
      System.out.println(((C)obj).d2); // typecasting allows it and we see C.d2
      
      obj.fun(); // available at C first
      obj.fun1(); // available only in P
    //   obj.fun2(); // not allowed, because compiler won't allow it
    ((C)obj).fun2(); // typecasting allows it and we see C fun2
  }


}