package lallora.point3_OnSubscriberCollection.consumers;

import lallora.point3_OnSubscriberCollection.FIElectricityConsumer;

public class Radio implements FIElectricityConsumer {
    void playMusic() {
        System.out.println("Музыка играет");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }


}
