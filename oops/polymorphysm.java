package oops;


/*
defination:
           Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance. ... Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.


types:
      compiletime_poly:(static_poly)
                      --can achive by method overloading

                      --handled by compiler
    
      runtime_poly:(dynamic_poly)
                      --can achive by method overloading

                      --handled by JVM


conditions_for_method_overloading:
                                 *same_name
                                 *same_class
                                 *different_arguments(any of the method should to be satisfy)
                                     number fo argument should diff
                                     sequence fo argument should diff
                                     type fo argument should diff
                   


conditions_for_method_overriding:
                                *same_name
                                *different_class
                                *same_arguments
                                     number fo argument should same
                                     sequence fo argument should same
                                     type fo argument should same
    
                       



*/
/*
//method_overloading
class method_overloading{
    public static void method_name(){
        System.out.println("this is the first method ");
    }
    public static void  method_name(String  a){
        System.out.println("this is :"+a);

    }
    public static void  method_name(int a, int b){
        System.out.println("this is: "+a+" and this is: "+b);
        
    }
    public static void main(String[] args) {
        method_name();
        method_name("aditya_band");  
        method_name(22,33);
        
    }
}

*/

//method_overriding
class super_class1{
    public void run(){
        System.out.println("run method from super_class");
    }

}
class child_class1 extends super_class{
    public void run(){   // here run method from child class overrides the method from parent /super class
        System.out.println("run method from child_class");
    }

}
class method_overriding1 {
    public static void main(String[] args) {
        child_class obj=new child_class();// here when we calld the run method then the mehtod form child class execute firse insted of parent class ...its because fo the method from parent class get overriden on the child class/or child class method overrides the parent class method 
        obj.run();
        
    }
    
}
