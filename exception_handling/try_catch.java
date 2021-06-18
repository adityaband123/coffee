package exception_handling;
/*

whenever their is exception, the method in which exception occures will create an object and that object will store three things

1) exception name( class name which can be handle the perticular exception )
2) discription ( type of the exception )
3) stack trace( proper discription )

then the main method will pass this object to the JVM ,and then the JVM will check that the perticular exception get handled by it or not....if not then the JVM will pass the  exception to the default excetption handler ....and the default exception handler will print the exception....but before reaching to the default exception handler JVM will abnormally terminate the program
....so to avoid that abnormal termination of the program while the exception occures we use the exception handling 

We can handle the exception using 5 keywords:
 try 
  catch 
    finally
      throw
        throws

syntax:

      try
      {
          //risky code
      }
      catch(ExceptionClassName ref.var.name)
      {
          //handling code
      }

*/
public class try_catch {
    public static void main(String[] args) {
        int a=4,b=0,c;
        try {
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {//here e is the reference fo the Arithmatioc exception which will store the  object created by the method 
            
            // In the above bracket we can pass only (Exception e)..when we dont know that the which type fo the exception should occure...............(Exception e) only because Exception is the parent class of all type of the exception                                    
                                                      
           System.out.println("this is the invalid operation !! ....we cant devide a number by zero...");
        }
        
    }
     
}
 