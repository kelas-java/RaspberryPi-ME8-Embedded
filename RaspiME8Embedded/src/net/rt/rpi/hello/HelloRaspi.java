package net.rt.rpi.hello;

import java.util.Timer;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class HelloRaspi extends MIDlet implements Runnable {
	//private MyThread mt;
	private Timer timer;
	private MyTask task;
	public HelloRaspi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		System.out.println("Keluar nih gak tahan");
		task.cancel();
//		mt.stop();
		
		 

	}

	@Override
	protected void startApp() throws MIDletStateChangeException {
		System.out.println("Hello");
		 timer=new Timer();
		 task=new MyTask();
		 
		 timer.schedule(task, 0,2000);
//		mt=new MyThread();
//		mt.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
