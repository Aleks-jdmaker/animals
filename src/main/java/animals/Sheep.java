package animals;

public class Sheep extends Herbivore{
    public Sheep(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String nameAndType = super.toString(); // Вызов родительского метода. Super - это родитель.
        return nameAndType + " I'am a sheep. Beeee"; // Можем сосредоточиться на конкретике.
    }
}
