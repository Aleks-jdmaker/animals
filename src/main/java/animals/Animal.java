package animals;

/*
 * Поля хранят состояние. (Условно существительные).
 * Методы отвечают за действие. (Условно глагол).
 * Конструктор - особый метод, создающий изначальное состояние объекта.
 * Имя конструктора совпадает с методом класса.
 */
public class Animal { // Расширяет класс Object.
    private String name;
    private final AnimalTypes type; // final меняется только из конструктора (Read only).

    public Animal(String name, AnimalTypes type) { // Конструктор с двымя параметрами (имя и тип).
        this.name = name;
        this.type = type;
    }
    @Override // Это аннотация (Добавляет возможности в метод).
    public String toString () { // Метод возвращает строку.
        return "Привет, меня зовут " + name + ".";
    }
}
