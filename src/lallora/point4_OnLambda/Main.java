package lallora.point4_OnLambda;

import lallora.point4_OnLambda.consumers.Lamp;
import lallora.point4_OnLambda.consumers.Radio;

public class Main {

    public static void main(String[] args) {
        Switcher sw = new Switcher();

        // Electricity consumers
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        //---------------------------------------------------
        //SOLUTION 1 (явное создание класса и его экземпляра)
        class Fire implements FIElectricityConsumer {
            @Override
            public void electricityOn() {
                System.out.println("Пожар");
            }
        }
        sw.addElectricityListener(new Fire());


        //---------------------------------------------------
        //SOLUTION 2 (анонимный класс, только интерфейс)
        sw.addElectricityListener(
                new FIElectricityConsumer() {
                    public void electricityOn() {
                        System.out.println("Пожар");
                    }
                });

        //---------------------------------------------------
        //SOLUTION 3 (тип компилятор видит из метода (убираем),
        //            название метода и модификаторы доступа понятны из самого интерфейса (убираем)
        //            получилось Лямбда-выражение)
        sw.addElectricityListener(
                () -> {
                    System.out.println("Пожар");
                }
        );

        //---------------------------------------------------
        //SOLUTION 4. Лямбда-выражение: () -> System.out.println("Пожар")
        // addElectricityListener ждёт объект, а мы ему подсовываем метод функционального интерфейса (с параметрами)
        sw.addElectricityListener(() -> System.out.println("Пожар"));

        sw.switchOn();
    }
}
