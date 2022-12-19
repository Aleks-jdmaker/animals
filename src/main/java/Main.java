import animals.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Predator> predatorCage = new ArrayList();
    private static final List<Herbivore> herbivoreCage = new ArrayList();
    private static final List<Animal> animals = new ArrayList();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) animals.add(Animal.createRandomAnimal());
        // добавить животных и принудительно посадить хищника в клетку травоядных.
        // try catch
        for (Animal animal : animals) {
            if (animal instanceof Predator) predatorCage.add((Predator) animal); // Преобразование типов (cast).
            else herbivoreCage.add((Herbivore) animal);
        }
        System.out.println("Predators: ");
        for (Animal animal : predatorCage) System.out.println(" * " + animal);
        System.out.println("Herbivores: ");
        for (Animal animal : herbivoreCage) System.out.println(" * " + animal);
    }
}
