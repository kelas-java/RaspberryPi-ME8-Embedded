package net.rt.rpi.hello;

import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("This is a timer");
		
	}

}
