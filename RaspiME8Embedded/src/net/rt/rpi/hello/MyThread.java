package net.rt.rpi.hello;

public class MyThread extends Thread{
	private volatile boolean shouldRun=true;
	@Override
	public void run() {
		while(shouldRun){
			System.out.println("This is a thread");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void stop(){
		shouldRun=false;
		interrupt();
	}
	
}
