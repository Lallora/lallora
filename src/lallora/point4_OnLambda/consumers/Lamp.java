package lallora.point4_OnLambda.consumers;

import lallora.point4_OnLambda.FIElectricityConsumer;

public class Lamp implements FIElectricityConsumer {
    void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }

}
