package exception_handling;

/*


1) e.printStackTrace();  
                        it will provide all/proper discription which will consist exception_name,discription,stack_trace

2) System.out.println(e)
                       provides excpt_name,discription 
3) System.out.println(e.toString)
                                 provides excpt_name,discription

4) System.out.println(e.getMessage)
                                   provides only discription

                                   ..here stackTrace means on which line the exception ocures

*/

public class method_to_print_exception_information {
  public static void main(String[] args) {
     
      try {
         System.out.println(3/0);
          
      } catch (Exception e) {
          System.out.println("Invalid Input");
          e.printStackTrace();
          
      }
  }
}
