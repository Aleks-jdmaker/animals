import animals.*;

import java.util.List; // Список объектов. Это интерфейс (абстрактный тип) им нельзя пользоваться напрямую.
import java.util.ArrayList; // Реализация списка. Можно создавать экземпляры (инстансы).

public class Main {
        private static final int ANIMAL_COUNT = 10; // Константа с количеством животных на проверку.
    private static final List<Predator> predatorCage = new ArrayList(); // Клетка с хищниками.
    // <Predator> - дженерик (generic), допустимый тип для данного листа.
    private static final List<Herbivore> herbivoreCage = new ArrayList(); // Клетка с травоядными.
    private static final List<Animal> animals = new ArrayList(); // Исходный список животных
    // (как хищников, так и травоядных).
    public static void main(String[] args) {
        for (int i = 0; i < ANIMAL_COUNT; i++) animals.add(Animal.createRandomAnimal()); /* Создаём несколько животных
        со случайным типом. */
        for (Animal animal : animals) { // Итерация (обход списка). Loop = цикл.
            if (animal instanceof Predator) predatorCage.add((Predator) animal); /* Преобразование типов (cast) - (Predator).
            Проверка, что текущее живтоное хищник.
            При добавении в список животное принудительно превращается в хищника. См. строку 8. */
            else herbivoreCage.add((Herbivore) animal);
        }
        // Выводим списки животных в клетках.
        System.out.println("Predators: ");
        for (Animal animal : predatorCage) System.out.println(" * " + animal);
        System.out.println("Herbivores: ");
        for (Animal animal : herbivoreCage) System.out.println(" * " + animal);
    }
}
