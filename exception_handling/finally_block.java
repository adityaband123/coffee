package exception_handling;

/*
   finally block will executes always..if their is exception occures of not

*/
public class finally_block {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (Exception e) {
            System.out.println("invalid_operation");
        }
        
        finally{
            System.out.println("this is the finally block");
        }
    }
    
}
