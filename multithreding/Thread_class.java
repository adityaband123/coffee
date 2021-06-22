package multithreding;

//creation of thread by extending Thread class
class my_new_thread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("this is the value for the i: " + i);
            try {
                sleep(3000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

public class Thread_class {
    public static void main(String[] args) {
        my_new_thread obj = new my_new_thread();
        obj.start();
    }

}
