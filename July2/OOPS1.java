import java.io.*;
import java.util.*;

class OOPS1 {
  
  static class Person {
      int age;
      String name;
      
      void sayHi(){
         // int age = 200;

          System.out.println(this.name + "[" + age + "] says hi.");
      }
  }
  
  
    
  public static void main(String[] args) throws NumberFormatException, IOException {
      
      Person p1 = new Person();
      p1.age = 10;
      p1.name = "A";
      p1.sayHi();
      
      Person p2 = new Person();
      p2.age = 20;
      p2.name = "B";
      p2.sayHi();
      
      Person p3 = p2;
      p3.sayHi();
      
      p2.name = "C";
      p2.sayHi();
      p3.sayHi();
      
      
  }
}