package animals;

public abstract class Herbivore extends Animal{
    public Herbivore(String name) { // name - параметр конструктора или метода.
        super(name, AnimalTypes.HERBIVORES); // Здесь 2 аргумента, значения их уже известны.
    }
}
