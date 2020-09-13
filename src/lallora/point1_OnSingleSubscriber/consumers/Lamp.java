package lallora.point1_OnSingleSubscriber.consumers;

import lallora.point1_OnSingleSubscriber.FIElectricityConsumer;

public class Lamp implements FIElectricityConsumer {
    void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }

}
