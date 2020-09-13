package lallora.point1_OnSingleSubscriber;

import lallora.point1_OnSingleSubscriber.consumers.Lamp;

public class Main {

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
