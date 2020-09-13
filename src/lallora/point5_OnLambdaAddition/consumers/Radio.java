package lallora.point5_OnLambdaAddition.consumers;

import lallora.point5_OnLambdaAddition.FIElectricityConsumer;

public class Radio implements FIElectricityConsumer {
    void playMusic() {
        System.out.println("Музыка играет");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }


}
