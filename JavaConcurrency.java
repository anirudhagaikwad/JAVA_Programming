package corejava;

public class JavaConcurrency {

	public static void main(String[] args) throws InterruptedException {
	 /*(new Thread(new FirstThread())).start();
     (new SecondThread()).start();
     SecondThread t3=new SecondThread();
     t3.start();
     try {
		t3.join(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     JavaConcurrency obj=new JavaConcurrency(); */
     /*try {
		obj.sleepMessage();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
     //obj.sleepMessageInterrupt();
     // Delay, in milliseconds before
     // we interrupt MessageLoop
     // thread (default one hour).
     long patience = 1000 * 10 * 10;

     // If command line argument
     // present, gives patience
     // in seconds.
     if (args.length > 0) {
         try {
             patience = Long.parseLong(args[0]) * 1000;
         } catch (NumberFormatException e) {
             System.err.println("Argument must be an integer.");
             System.exit(1);
         }
     }

     threadMsg("Starting MessageLoop thread");
     long startTime = System.currentTimeMillis();
     Thread t = new Thread(new MessageLoop());
     
     t.start();

     threadMsg("Waiting for MessageLoop thread to finish");
     // loop until MessageLoop
     // thread exits
     while (t.isAlive()) {
         threadMsg("Still waiting...");
         // Wait maximum of 1 second
         // for MessageLoop thread
         // to finish.
         t.join(1000);
         if (((System.currentTimeMillis() - startTime) > patience)
               && t.isAlive()) {
             threadMsg("Tired of waiting!");
             t.interrupt();
             // Shouldn't be long now
             // -- wait indefinitely
             t.join();
         }
     }
     threadMsg("Finally!");
     
     //################################################################
     final Emp e1=new Emp("E1");
     final Emp e2=new Emp("E2");
     new Thread(new Runnable() {
		@Override
		public void run() {
			
		e1.bow(e2);	
		}
	}).start();
     new Thread(new Runnable() {
 		@Override
 		public void run() {
 			
 		e2.bow(e1);	
 		}
 	}).start();
	}//main()
	
	//display message ,preceded the name of current thread
	static void  threadMsg(String msg) {
		String threadName=Thread.currentThread().getName();
		System.out.println("ID : "+Thread.currentThread().getId());
		System.out.format("%s: %s%n",threadName,msg);
	}
	private static class MessageLoop implements Runnable{
		@Override
		public void run() {
			String[] impMsg= {"Oracle increse price of java","Rust is more efficient than","PostgrSQL","Atlance"};
			try{
				for(int i=0;i<impMsg.length;i++) {
			
				// pause for 5 seconds
				Thread.sleep(5000);
				//print message
				threadMsg(impMsg[i]);
		}
			}catch(InterruptedException e) {threadMsg("Its not done...");}
		}//run()
	}//MessageLoop
	
	void sleepMessage() throws InterruptedException {
		String[] impMsg= {"Oracle increse price of java","Rust is more efficient than","PostgrSQL","Atlance"};
		for(int i=0;i<impMsg.length;i++) {
			// pause for 5 seconds
			Thread.sleep(5000);
			System.out.println(impMsg[i]);
		}
	}//sleepMessage
	
	void sleepMessageInterrupt() {
		String[] impMsg= {"Oracle increse price of java","Rust is more efficient than","PostgrSQL","Atlance"};
		for(int i=0;i<impMsg.length;i++) {
			// pause for 5 seconds
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			   // interrupted: no more messages
				e.printStackTrace();
			}
			System.out.println(impMsg[i]);
			boolean bool=Thread.interrupted();
			if(bool) {
				return; // interrupted : no more thread
			}
		}
	}//sleepMessage

}//JavaConcurrency

class FirstThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello from FirstThread...");		
	}	
}//FirstThread

class SecondThread extends Thread{
	public void run() {
		System.out.println("Hello from SecondThread..");
	}
}//SecondThread

class Emp{
	private final String name;

	public Emp(String name) {
		this.name = name;
	}//constructor

	public String getName() {
		return name;
	}//getter
	
	public synchronized void bow(Emp bower) {
		System.out.format("%s: %s"+" has bowed to me %n",this.name,bower.getName());
		bower.bowBack(this);
	}
	public synchronized void bowBack(Emp bower) {
		System.out.format("%s: %s"+" has bowed back to me %n",this.name,bower.getName());
	}
}//Emp