package lallora.point4_OnLambda.consumers;

import lallora.point4_OnLambda.FIElectricityConsumer;

public class Radio implements FIElectricityConsumer {
    void playMusic() {
        System.out.println("Музыка играет");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }


}
