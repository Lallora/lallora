package lallora.point4_OnLambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    // ссылка на любой объект с этим интерфейсом
    private List<FIElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(FIElectricityConsumer listener) {
        System.out.println(" * Добавление подписчика");
        listeners.add(listener);
    }

    public void removeElectricityListener(FIElectricityConsumer listener) {
        System.out.println(" * Удаление подписчика");
        listeners.remove(listener);
    }

    void switchOn() {
        System.out.println(" --- Выключатель включён");

        for (FIElectricityConsumer c : listeners) {
            c.electricityOn();
        }
    }


}
