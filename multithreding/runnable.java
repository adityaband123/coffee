package multithreding;
//creation our thread with the help of the runnable method

class my_thread implements Runnable {

    @Override
    public void run() {
       //task for the thread
        for (int i = 1; i < 5; i++) {
            System.out.println("the value of the i is : " + i);


            // Below we need to add a try_catch block because sleep() method in the multithreading throws an Inturupted error
            try {
                Thread.sleep(1999);       // we can add a delay in mili_sec at the time of the execution of the threads
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }

        }
    }
}
class _kaliya{
    public static void main(String[] args) {

        //object creation for the thread
        my_thread m=new my_thread();
       // m.start();
       // it will throw an error because this class my_thread or its parrent Runnable does not have any of the start method so we need to add a object of a helper class as follow and simply pass the reference fo the my_thread class that is m to the Thread  object 
        Thread T=new Thread(m);
        T.start();

    }
} 
