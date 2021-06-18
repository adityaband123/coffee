package oops;

/*
abstract:
        existing in thought or as an idea but not having a physical or concrete existence.

process_of_abstraction:
                        Data abstraction is the process of hiding certain details and showing only essential information to the user. 

abstract_method:
                ABSTRACT METHOD in Java, is a method that has just the method definition but does not contain implementation. A method without a body is known as an Abstract Method. 


abstract_class:
               if the class include abstract method the class itself must be declare abstract as in..

syntax:
       public abstract class phone{
           abstract void switch_off();
       }

       as like the other method abstract method does not have the method body
       only defination not implimentaiton

Note:     
       -- if their is an abstract class then no need their should be an abstract method   inside    this class
          but the class having abstract method shoud be abstract

       -- if their is any class inherits parent class then their is a condition
       that all the abstract method defined in the parent class should be define in the child/derived class


       we cannot create the object fo the abstract method




*/
 abstract class parent_{
     abstract void  start();

}
class child1 extends parent_{
    public void start(){ 
        System.out.println("first child");
    }

}
class child2 extends parent_{
    public void start(){
        System.out.println("second child");
    }

}

class mr_robot{
    public static void main(String[] args) {
      child1 c1=new child1();
      c1.start();
      child2 c2=new child2();
      c2.start();
        
    }
}