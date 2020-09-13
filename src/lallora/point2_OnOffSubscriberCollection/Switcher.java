package lallora.point2_OnOffSubscriberCollection;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    // ссылка на любой объект с этим интерфейсом
    private List<IElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(IElectricityConsumer listener) {
        System.out.println(" * Добавление подписчика");
        listeners.add(listener);
    }

    public void removeElectricityListener(IElectricityConsumer listener) {
        System.out.println(" * Удаление подписчика");
        listeners.remove(listener);
    }

    void switchOn() {
        System.out.println(" --- Выключатель включён");

        for (IElectricityConsumer c : listeners) {
            c.electricityOn();
        }
    }

    void switchOff() {
        System.out.println(" --- Выключатель выключен");

        for (IElectricityConsumer c : listeners) {
            c.electricityOff();
        }

    }

}
