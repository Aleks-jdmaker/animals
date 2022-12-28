package animals;

/*
 * Поля хранят состояние. (Условно существительные).
 * Методы отвечают за действие. (Условно глагол).
 * Конструктор - особый метод, создающий изначальное состояние объекта.
 * Имя конструктора совпадает с методом класса.
 */
public abstract class Animal { // Расширяет класс Object.
    private String name;
    private final AnimalTypes type; // final меняется только из конструктора (Read only).

    public Animal(String name, AnimalTypes type) { // Конструктор с двымя параметрами (имя и тип).
        this.name = name;
        this.type = type; //  Изменить значение поля final можно только из конструктора.
    }
    @Override // Это аннотация (Добавляет возможности в метод).
    public String toString () { // Метод возвращает строку.
        String postfix = type == AnimalTypes.HERBIVORES ? "herbivore" : "predator"; // Тернарнарный оператор.
        return "Hello, my name is " + name + ". I'am a " + postfix + ".";
    }
    public static Animal createRandomAnimal() throws IllegalAccessException { // Фабрика.
        double r = Math.random();
        if (r < 0.25) return new Sheep("Dolly" + r);
        if (r < 0.5) return new Crocodile("Gena" + r);
        if (r < 0.75) return new Bulldog("Spike" + r);
        return new Labrador("Patrik" + r);
    }

}
