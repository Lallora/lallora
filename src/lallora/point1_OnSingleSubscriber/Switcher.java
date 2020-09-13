package lallora.point1_OnSingleSubscriber;

public class Switcher {

    // ссылка на любой объект с этим интерфейсом
    public FIElectricityConsumer consumer;

    void switchOn() {
        System.out.println("Выключатель включён");

        if (consumer != null) {
            consumer.electricityOn();
        }
    }

}
