package oops;
/*
defination:
           In java inheritance is the mechanism in which child class inherits/aquires all the properties of the parent class


Super Class: 
           The class whose features are inherited is known as superclass(or a base class or a parent class).


Sub Class:
         The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.


Reusability:
           Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.


           NOTE:
                WE USE extends KEYBOARD TO USE INHERITANCE MECHANISM


syntax:
               class derived-class extends base-class  
           {  
              //methods and fields  
           }  


types_of_inheritance_supported_by_java:
                                       Single Inheritance.
                                       Multiple Inheritance (Through Interface)
                                       Multilevel Inheritance.
                                       Hierarchical Inheritance.
                                       Hybrid Inheritance (Through Interface)


*/



/* 
//single inheritance
class c1{
    void method(){
        System.out.println("method_c1");
    }
}
class c2 extends c1{

}
 class single_inheritance{
    public static void main(String[] args) {
        c2 obj=new c2();
        obj.method();
    }
}
*/



/* 
//multilevel inheritance

class first{
    public void first_method(){
        System.out.println("this is the first method");
    }
}
class second extends first{
    public void second_method(){
        System.out.println("this is the second method");
    }
}
class third extends second{
    public void third_method(){
        System.out.println("this is the third method");
    }
}
public class inheritance_ {
 public static void main(String[] args) {
     third object=new third();
     //by creating the object of the child class which extends the parent class ,all the properties of the parent  class can be aquire
     object.first_method();
     object.second_method();
     object.third_method();
     
     
 }   
}

*/


/*


// concept of Hierarchical inheritance

class A {
	public void print_A() { System.out.println("Class A"); }
}

class B extends A {
	public void print_B() { System.out.println("Class B"); }
}

class C extends A {
	public void print_C() { System.out.println("Class C"); }
}

class D extends A {
	public void print_D() { System.out.println("Class D"); }
}

// Driver Class
public class Test {
	public static void main(String[] args)
	{
		B obj_B = new B();
		obj_B.print_A();
		obj_B.print_B();

		C obj_C = new C();
		obj_C.print_A();
		obj_C.print_C();

		D obj_D = new D();
		obj_D.print_A();
		obj_D.print_D();
	}
}

*/



/*
 NOTE:
     *
      java does not support multiple inheritance ......but even we can achive with the help of concept of the interface in the java


   **
      The reason behind this is to prevent ambiguity. Consider a case where class B extends class A and Class C and both class A and C have the same method display(). Now java compiler cannot decide, which display method it should inherit. To prevent such situation, multiple inheritances is not allowed in java
         
         
         */

interface Event {
    public void start();
 }
 interface Sports {
    public void play();
 }
 interface Hockey extends Sports, Event{
    public void show();
 }
  class Tester{
    public static void main(String[] args){
       Hockey hockey = new Hockey() {
          public void start() {
             System.out.println("Start Event");
          }
          public void play() {
             System.out.println("Play Sports.");
          }
          public void show() {
             System.out.println("Show Hockey.");
          }
       };
 
       hockey.start();
       hockey.play();
       hockey.show();
    }
 }


         
/* //hybrid inheritance in java
         interface A {
             public void methodA();
         }
         interface B extends A {
             public void methodB();
         }
         interface C extends A {
             public void methodC();
         }
         class HybridInheritance implements B, C {
             public void methodA() {
                 System.out.println("Calling methodA");
             
             }
             public void methodB() {
                 System.out.println("Calling methodB");
             }
             public void methodC() {
                 System.out.println("Calling methodC");
             }
             public static void main(String args[]) {
                 HybridInheritance obj = new HybridInheritance();
                 obj.methodA();
                 obj.methodB();
                 obj.methodC();
             }
         }*/
