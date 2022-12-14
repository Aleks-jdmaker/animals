package animals;

public class Crocodile extends Predator{
    public Crocodile(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String nameAndType = super.toString(); // Вызов родительского метода. Super - это родитель.
        return nameAndType + " Привет, I'am a crocodile.";
    }
}
