package lallora;

public class Switcher {

    // ссылка на любой объект с этим интерфейсом
    public IElectricityConsumer consumer;

    void switchOn() {
        System.out.println("Выключатель включён");

        if (consumer != null) {
            consumer.electricityOn();
        }
    }
}
