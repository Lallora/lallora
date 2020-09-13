package lallora.point6_Predicates_StreamLambdaCollection;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergey", 18));
        persons.add(new Person("Dasha", 34));
        persons.add(new Person("Masha", 14));
        persons.add(new Person("Sasha", 48));
        persons.add(new Person("German", 25));

        // Императивный метод
        for (Person p : persons) {
            System.out.println(p);
        }

        // Декларативный метод (stream возвращает объект класса стрим (из Java8), у него есть
        // набор методов, которые в качестве параметров принимают функциональные интерфейсы,
        // вместо которых мы можем подсунуть лямбда-выражения, т.е. функции
        // в forEach встроен метод, который принимает элемент коллекции (у нас Person p)
        //persons.stream().forEach((Person p) -> {"все что хотим сделать"});

        // Solution 1
        persons.stream().forEach((Person p) -> {
            System.out.println(p);
        });

        // Solution 2
        persons.stream().forEach(p -> System.out.println(p));

        // Solution 2 (параметр определяется по persons)
        // persons.stream().forEach(System.out::println); // можно сократить до
        persons.forEach(System.out::println);

        System.out.println("");

        // Solution 3 (с фильтрацией и компаратором)
        persons.stream().
                filter(p -> p.getAge() > 20).
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                forEach(System.out::println);

        // Solution 4 (с фильтрацией и компаратором)
        // методы стрима называются еще агрегатными операциями
        persons.stream().
                filter(p -> p.getAge() > 20).
                sorted(Comparator.comparing(Person::getName)).
                forEach(System.out::println);

        System.out.println("");

        // Solution 5 (преобразование коллекции на лету. выведем только имена)
        persons.stream().
                filter(p -> p.getAge() > 20).
                sorted(Comparator.comparing(Person::getName)).
                map(p -> p.getName()).
                forEach(System.out::println);

        System.out.println("");

        // Solution 5 (получим средний возраст)
        double average = persons.stream().
                filter(p -> p.getAge() > 20).
                mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(average);
    }

}
