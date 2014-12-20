package net.rt.rpi.hello;

import java.util.ArrayList;
import java.util.List;

public class CountingDevice extends Thread {
	   private volatile boolean shouldRun = true;
	    private volatile int count;
	    private final int trigger;
	    private volatile List<CountListener> listeners;

	    // Count to 10 and then start over 
	    // the value passed in determines when to 
	    // notify the listeners
	    public CountingDevice(int trigger) {
	        this.trigger = trigger;
	        listeners = new ArrayList<>();
	    }

	    public void addCountListener(CountListener listener) {
	        listeners.add(listener);
	    }

	    @Override
	    public void run() {
	        count = -1;
	        while (shouldRun) {
	            System.out.println("Current count..." + (++count));
	            if (count == trigger) {
	                // call back the listeners
	                for (CountListener c : listeners) {
	                    c.countReached(count);
	                }
	            }
	            // Reset the count over 10
	            if (count > 9) {
	                count = -1;
	            }
	            try {
	                sleep(2000);
	            } catch (InterruptedException ex) {
	            }
	        }
	    }

	    public void stop() {
	        shouldRun = false;
	        interrupt();
	    }
}
