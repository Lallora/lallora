package lallora.point5_OnLambdaAddition.consumers;

import lallora.point5_OnLambdaAddition.FIElectricityConsumer;

public class Lamp implements FIElectricityConsumer {
    void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }

}
