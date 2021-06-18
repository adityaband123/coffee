package oops;


/*

defination:
          A constructor in Java is a special method that is used to initialize objects. 
          The constructor is called when an object of a class is created.

syntax:
       class Test {
        Test() {
           // constructor body
        }
      }


characteristics:
               A consturctor have same name as that of class

               An interface cannot have the constructor.
               
               Constructors cannot be private.

               A constructor cannot be abstract, static, final, native, strictfp, or synchronized.

               A constructor can be overloaded.

               Constructors cannot return a value.

               Constructors do not have a return type; not even void.



Types of Constructor:

                1) No-Arg Constructor:
                                     This is the constuructors which does not take any type of the arguments

                2) Parameterized Constructor:
                                            The constructors which accepts parameters/arguments 

                3) Default Constructor:
                                       If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program. This constructor is called default constructor.

*/



/*
class Main {
    private String name;
  
    // constructor
    Main() {
      System.out.println("Constructor Called:");
      name = "____tyrant____";
    }
  
    public static void main(String[] args) {
  
      // constructor is invoked(get called) while
      // creating an object of the Main class
      Main obj = new Main();
      System.out.println("The name is " + obj.name);
    }
  }

  */



/*
 // No argument constructors
  class monster{
      public monster(){
          System.out.println("constructor without any arguments");
      }
      public static void main(String[] args) {
          monster obj=new monster();  // as the object get created at that time constructor get called

      }
  }
 */




/*

//Parameterized Constructor
class par_const{
    int ID;
    String NAME;

    par_const(int id ,String name){
        this.ID=id;
        this.NAME=name;
        //The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between //class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter). 
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        par_const obj=new par_const(3,"tyrant");
        
        
    }
}
 
 */


 

 /*

 // Default constructor:
  
 class no_arg_cons{
     int a;
     boolean b;
     public static void main(String[] args) {
         no_arg_cons obj=new no_arg_cons();
        System.out.println(obj.a);       // 0
        System.out.println(obj.b);      // false
         
     }
 }
 
 */
//constructor overloading
class cons_overloading{
    cons_overloading(){
        System.out.println("no args");
    }
    cons_overloading(int a){
        System.out.println("the value of a is :"+a);
    }

  public static void main(String[] args) { 
      cons_overloading obj=new cons_overloading();
      cons_overloading obj1=new cons_overloading(3);

  }
}