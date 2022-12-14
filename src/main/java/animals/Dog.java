package animals;

public class Dog extends Predator{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String nameAndType = super.toString(); // Вызов родительского метода. Super - это родитель.
        return nameAndType + " I'am a dog.";
    }
}
