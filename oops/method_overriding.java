package oops;


/*
defination:
           if the same method is defined in both the superclass and the subclass, then the method of the subclass class overrides the method of the superclass. This is known as method overriding.
*/


class super_class{
    public void run(){
        System.out.println("run method from super_class");
    }

}
class child_class extends super_class{
    public void run(){   // here run method from child class overrides the method from parent /super class
        System.out.println("run method from child_class");
    }

}
public class method_overriding {
    public static void main(String[] args) {
        child_class obj=new child_class();// here when we calld the run method then the mehtod form child class execute firse insted of parent class ...its because fo the method from parent class get overriden on the child class/or child class method overrides the parent class method 
        obj.run();
        
    }
    
}
