package lallora.point2_OnOffSubscriberCollection.consumers;

import lallora.point2_OnOffSubscriberCollection.IElectricityConsumer;

public class Lamp implements IElectricityConsumer {
    void lightOn() {
        System.out.println("Лампа зажглась");
    }

    void lightOff() {
        System.out.println("Лампа выключена");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }

    @Override
    public void electricityOff() {
        lightOff();
    }
}
