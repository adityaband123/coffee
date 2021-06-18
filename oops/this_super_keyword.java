package oops;


/*
this_keyword:
             The use of this keyword is to to refer to the current object inside a method or a constructor.

             and it generally get in use to avoid the confussion between the class attrribute and the class variable name
           
super_keyword:
             The use of The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).

*/

/* 
//use of this keyword  to refer the current object inside the constructor

class Main {
    int instVar;

    Main(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("object reference = " + obj);
    }
}
*/



/*
//use of this keyword to avoid the confussion between class variable name and  method attributes
class Main {

    int age;
    Main(int age){
        // age = age; //insted of showing result as 8 it will show 0 ...it get confuse between the same name
        

        //hence in case to avoid such type of the confusion we use this keyword
        this.age=age; // now the result will become as 8
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}
 */

/*



//use of super keyword To call methods of the superclass that is overridden in the subclass.:
class first{
    public void display(){
        System.out.println("this is method from parent class");
    }
}
class second extends first{
    public void display(){
        super.display();
        System.out.println("this is the method from child class");
    }
}
class MM{
    public static void main(String[] args) {
        second obj=new second();   //here the method will call from child  class ..
                                  //hence to call the method from the parent class we need to use super keyword
        obj.display();
    }
}
*/





//use of super keyword to access the attribute having same name in the base class as the child class
class first{
    String name="adi";
}
class second extends first{
    String name="tyrant";
    public void method(){
        System.out.println("the attribute from the child class is : "+name);
        System.out.println("the attribute from base class is :"+super.name);//in this way with the help of the super keyword we can access the attribute of the base class having same name as the child class 
    }
}
class c{
    public static void main(String[] args) {
        second object=new second();
        object.method();
        
    }
}




/*



//use of the super keyword to access superclass constructor
class super_{
    super_(){
        System.out.println("this is the super class constructor");
    }
    
}
class child extends super_{
    
    child(){
        super();   // in this way we can call constructor from the superclass ....
        System.out.println("this  is the child class constructor");
    }
    
    
}
class mr_robot{
    public static void main(String[] args) {
        child obj=new child();
        
        
    }
}
*/

