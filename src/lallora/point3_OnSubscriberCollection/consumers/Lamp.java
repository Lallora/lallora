package lallora.point3_OnSubscriberCollection.consumers;

import lallora.point3_OnSubscriberCollection.FIElectricityConsumer;

public class Lamp implements FIElectricityConsumer {
    void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }

}
