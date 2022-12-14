import animals.*;

import javax.xml.namespace.QName;

public class Main {
    /**

     */
    public static void main(String[] args) { // Главный метод класса. Точка входа в программу.
        // Создаём переменную animal типа Animal с помощью конструктора (оператор - new).
        // Эта переменная - инстанс класса Animal.
        Animal animal = new Animal("Ball", AnimalTypes.PREDATORS);
        // Выводим на экран. Поскольку в классе реализован метод toString,
        // инстанс (экземпляр, объект) автоматически превращается в строку.
        System.out.println(animal);
        System.out.println(new Predator("Gena"));
        System.out.println(new Crocodile("Gena"));
        System.out.println(new Sheep("Dolly"));
        System.out.println(new Dog("Snoopy"));
        System.out.println(new Buldog("Spike"));
        System.out.println(new Object()); // Вывод на экран описания объекта без переопределённого toString.
        // java.lang.Object@12edcd21 Перед "@" - тип, после - адрес в ОЗУ.

    }
}
