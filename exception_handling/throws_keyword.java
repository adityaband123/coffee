package exception_handling;
/*
We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.

*/

public class throws_keyword {
   public static void main(String[] args) throws ArithmeticException{
       System.out.println("this is the use of the throws keyword");
       System.out.println(3/0);
   }
   
    
}
