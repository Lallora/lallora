package lallora.consumers;

import lallora.IElectricityConsumer;

public class Lamp implements IElectricityConsumer {
    void lightOn(){
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
