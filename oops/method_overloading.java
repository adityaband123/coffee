package oops;


/*

defination: 
           “Method overloading is a feature of Java in which a class has more than one method of the same name and their parameters are different.” 
           
           ... When more than one method of the same name is created in a Class, this type of method is called Overloaded Methods.



*/

public class method_overloading {
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
