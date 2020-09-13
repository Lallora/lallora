package lallora.point5_OnLambdaAddition;

import lallora.point5_OnLambdaAddition.consumers.Lamp;
import lallora.point5_OnLambdaAddition.consumers.Radio;


public class Main {

    public static void fire(Object sender) {
        System.out.println("Пожар из статика");
    }

    public void fire2(Object sender) {
        System.out.println("Пожар2 из нестатика");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();


        // Electricity consumers
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        //---------------------------------------------------
        //SOLUTION 5 ()
        sw.addElectricityListener((Object sender) -> System.out.println("Пожар"));


        // захват переменной. но переменную нельзя менять, она должна быть финализирована.
        // или явно, или эффективно финализирована
        //       final String strFire1 = "Пожар1"; так можно уже не писать, но ...

        String strFire1 = "Пожар1";
        //strFire1 = "Пожар11"; //- приведет к ошибке

        //---------------------------------------------------
        //SOLUTION 6 (переменная доступна внутри анонимного класса)
        sw.addElectricityListener(sender -> {
                    System.out.println(strFire1);
                    System.out.println("Пожар2");
                }
        );

        //---------------------------------------------------
        //SOLUTION 7 (со статическим методом.
        // набор параметров статического метода в точности совпадает с набором параметров ФИнтерфейса.
        // лямбда здесь вызывает другой метод с таким же параметром)
        sw.addElectricityListener(s -> Main.fire(s));

        //---------------------------------------------------
        //SOLUTION 8 (со статическим методом.
        // :: показывает, что за ним метод, а не поле
        // работает это только тогда, когда параметры этого метода в точности совпадают с параметрами лямбда-выражения,
        // поэтому можно сделать просто указание на этот метод)
        sw.addElectricityListener(Main::fire);

        //---------------------------------------------------
        //SOLUTION 9 (если этот метод не статический, то используется ссылка не на класс, а на его объект)
        Main m = new Main();
        sw.addElectricityListener(m::fire2);

        sw.switchOn();
    }
}
