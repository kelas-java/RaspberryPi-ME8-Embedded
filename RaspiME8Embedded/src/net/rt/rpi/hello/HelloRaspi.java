package net.rt.rpi.hello;


import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;



public class HelloRaspi extends MIDlet implements CountListener{
    private CountingDevice device;

	public HelloRaspi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		System.out.println("Keluar nih gak tahan");
        device.stop();

		
		 

	}

	@Override
	protected void startApp() throws MIDletStateChangeException {
		System.out.println("Hello");
		 device = new CountingDevice(5);
	        device.addCountListener(this);
	        device.start();

	}

	@Override
	public void countReached(int count) {
        System.out.println("In TestIMlet: countReached: count: " + count);
		
	}



	

}
