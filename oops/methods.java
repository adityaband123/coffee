package oops;


/*
defination: 
           In general, a method is a way to perform some task. Similarly, the method in Java is a collection of instructions that performs a specific task. It provides the reusability of code.

           By using method the code complaxity can be reduce

syntax    :
           datatype name_of_method(){
               method body
           }



static keyword: 
               when the static keyword get used then the method related to the corresponding class get used by all the objects fo the class...



void   : the keyword  "void" is used when the function/method does not return anything
       
           for ex:
                 public void method_name(){
                     System.out.println("......")
                      }

*/


/* 

public class methods {
    static int square(int n){
        
        //above we have used static keyword ...because if we use static keyword then their is no need to create its objetc inside the main method 
        return n*n;
    }
    public static void main(String[] args) {
        int num=33;
        System.out.println(square(num));
    }
}

*/



/* 

class  class_name {
   static int logic(int x, int y) {
        int z;
        if (x > y) {
            return x + y;
        } else {
            z = (x + y) * 12;
        }
        return z;

    }

    public static void main(String[] args) {
        int a=2,b=3;
        int c;
        c=logic(a,b);
        System.out.println(c);
    }
}

*/


 class class_name{
     public int  substract(int a,int b){
         return a-b;
     }
    public static void main(String[] args) {
    class_name obj=new class_name();
    int result=obj.substract(3, 55);
    System.out.println(result);
    }
}
