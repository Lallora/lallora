package lallora.point2_OnOffSubscriberCollection.consumers;

import lallora.point2_OnOffSubscriberCollection.IElectricityConsumer;

public class Radio implements IElectricityConsumer {
    void playMusic() {
        System.out.println("Музыка играет");
    }

    void stopMusic() {
        System.out.println("Музыка не играет");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }

    @Override
    public void electricityOff() {
        stopMusic();
    }

}
