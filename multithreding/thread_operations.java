package multithreding;
/*
Thread_class:
            -thread class provides the methods to performe the operations with threads
            -this thread class is present in the java.lang package in the java so no need to import it.
Note:
     java.lang is the package which is auto imported in our classes
     
some IMP thread methods:
                        -public string getName()-returns the name of thread

                        -public void setName(String name)-set the name of  the thread
                        
                        -public void run()-contain the task of thread

                        -public long getid()-returns the id of the thread

                        -setPriority(P),getPririty()-set and get the priority
                        
                        -sleep(),join(),interrupt(),resume(),stop

*/
class UserThread extends Thread{
	public void run()
	{
		//task for thread...
		System.out.println("this is user defined thread.");
	}
}
class ThreadOp
{
	public static void main(String[] args) {
		System.out.println("program started..");	
		int x=56+34;
		System.out.println("sum is "+x);
		//Thread...
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("current running thread is "+tname);
		//setName
		t.setName("MyMain");
		System.out.println(t.getName());
		try{
			Thread.sleep(5000);
		}catch(Exception e){
		};
		System.out.println(t.getId());
		//going to start user defined thread.
		System.out.println("program ended..");	
		UserThread thread=new UserThread();
		thread.start();

	}
}