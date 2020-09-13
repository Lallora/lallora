package lallora;

import lallora.consumers.Lamp;

public class MainPoint1 {

    public static void main(String[] args) {
	    Switcher sw = new Switcher();

	    // Electricity consumers
	    Lamp lamp = new Lamp();

	    // Event subscribe
	    sw.consumer = lamp;

	    sw.switchOn();
		sw.switchOn();
    }
}
