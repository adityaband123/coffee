package multithreding;
/*

process: 
        A program in execution is often referred as process. 

multiprocessing:
                execution of the multiple process is  calles as multiprocessing.

thread:
       a thread is  the small unit of the process 
       we can consider the example of the VLC media player in which ,at a time a song is play ,then the decreasing timing of the song is show in one corner,also the thumnail of the song is seen 
       all of these things are called as the threads in a process

multithreding:
              Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.

              it is the combination of the multiple threads



__________________________________________________________________________________________________________



methods to create threads in Java:
                                   1) Runnable   it is a interface 
                                                               \
                                                                \
                                                                these both the methods are present inside the java.lang package provided by java
                                                               /                   
                                    2) Thread  it is a class /
                                   
                                   




***************************************************************************************************************************************
Differences Between Thread and Runnable in Java

 As each thread is associated with a unique object when created by extending Thread class, more memory is required.
 On the other hand, each thread created by implementing Runnable interface shares same object space hence, it requires less memory
 
***************************************************************************************************************************************


                             Interface Runnable{  run(); }               // the task given to the thread will written in the run method present
                                          e                                                               in the  runnable interface

                                          x

                                          t            it meance all the properties of the runnable are 
                                                                              with thread class
                                          e

                                          n

                                          d

                                          s
                                    Class Thread{}




__________________________________________________________________________________________________________


in case to create a thread:



                                                 we can implements Runnable method
                                                /  
                                              /
                                            /
                                          /
                                        /
                                      /
                  class myThread(){}
                                     \
                                      \
                                       \
                                        \
                                         \
                                          \
                                           we can  extends Thread class



__________________________________________________________________________________________________________







*/
public class basics_of_multithreding{
    public static void main(String[] args) {
        
    }
}