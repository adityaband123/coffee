package exception_handling;
/*
Exception:
         An exception is an unexpected event that occurs during program execution. It affects the flow of the program instructions which can cause the program to terminate abnormally.


Error:
      An Error “indicates serious problems that a reasonable application should not try to catch.”


may occure due to:
                  Invalid user input
                  Device failure
                  Loss of network connection
                  Physical limitations (out of disk memory)
                  Code errors
                  Opening an unavailable file




JAVA_EXCEPTION_HIERARCHY:     


                  Throwable
                      |
           ...........................
          |                            |
       Error                       Exception
                                      |
                           ........................
                           |                       |
                    Runtime_exception               IO_exception
                    
                    



RuntimeException:
                A runtime exception happens due to a programming error. They are also known as unchecked exceptions.

                **
                  “If it is a runtime exception, it is your fault”.


               Improper use of an API - IllegalArgumentException

               Null pointer access (missing the initialization of a variable) - NullPointerException

               Out-of-bounds array access - ArrayIndexOutOfBoundsException

               Dividing a number by 0 - ArithmeticException





IOException:
          It is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions. 
           
          Trying to open a file that doesn’t exist results in FileNotFoundException
          Trying to read past the end of a file






Different Approaches to handle exception in java:
                                                try...catch block
                                                finally block
                                                throw and throws keyword



Difference between final,finally and finalize

final:
     it is the keyword is use with variable by which they become constont
                              with  method then the methods cant be override
                              with class which will not get inherite with the other class


finally:
       it is the block which is use in the exception handling to close the resources  or for any other stuffs in the code ..because it is the block which occure always in the code even if their is an exception in the code or not.....


finalize:
        Finalize() is the method of Object class. This method is called just before an object is garbage collected. finalize() method overrides to dispose system resources, perform clean-up activities and minimize memory leaks.


 */






