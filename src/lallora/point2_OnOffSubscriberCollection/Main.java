package lallora.point2_OnOffSubscriberCollection;

import lallora.point2_OnOffSubscriberCollection.consumers.Lamp;
import lallora.point2_OnOffSubscriberCollection.consumers.Radio;

public class Main {

    public static void main(String[] args) {
	    Switcher sw = new Switcher();

	    // Electricity consumers
	    Lamp lamp = new Lamp();
	    Radio radio = new Radio();

	    // Event subscribe
	    sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);

	    sw.switchOn();
		sw.switchOff();

		sw.removeElectricityListener(radio);

		sw.switchOn();
		sw.switchOff();
    }
}
