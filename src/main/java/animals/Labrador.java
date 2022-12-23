package animals;

public class Labrador extends Dog{
    public Labrador(String name) throws IllegalAccessException {
        super(name);
        this.speed = 20;
        this.weight = 50;
    }
}
