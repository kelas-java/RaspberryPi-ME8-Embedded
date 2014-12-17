package net.rt.rpi.hello;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class HelloRaspi extends MIDlet {
	private MyThread mt;
	public HelloRaspi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		System.out.println("Keluar nih gak tahan");
		mt.stop();

	}

	@Override
	protected void startApp() throws MIDletStateChangeException {
		System.out.println("Hello");
		mt=new MyThread();
		mt.start();

	}

}
