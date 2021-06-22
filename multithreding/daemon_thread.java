package multithreding;
/*
Daemon_thread:
              Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.

              these are the threads which provide the service to the other threads

Properties:
           They can not prevent the JVM from exiting when all the user threads finish their execution.

           JVM terminates itself when all user threads finish their execution

           If JVM finds running daemon thread, it terminates the thread and after that shutdown itself.JVM does not care whether Daemon thread is running or not.

           It is an utmost low priority thread.



Types:
      1)setDaemon(Boolean)
      2)public Boolean isDaemon()

      Garbage collector is the best example for the Daemon thread


      ex:
         if any of the thread is running then the garbage collector (gc) will provide service to that thread.
         as the working of the thread get compleated at the same place the gc will stop collecting the garbage 

*/

public class daemon_thread {
    
}
