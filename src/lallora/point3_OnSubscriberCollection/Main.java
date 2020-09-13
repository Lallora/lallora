package lallora.point3_OnSubscriberCollection;

import lallora.point3_OnSubscriberCollection.consumers.Lamp;
import lallora.point3_OnSubscriberCollection.consumers.Radio;

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

        sw.removeElectricityListener(radio);

        sw.switchOn();
    }
}
