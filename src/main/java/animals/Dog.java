package animals;

public abstract class Dog extends Predator{
    protected double weight;

    public double getSpeed() {
        return speed * Math.random();
    }
    protected double speed;
    public double getWeight() {
        return weight;
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String greeting = null;
        if (this instanceof Labrador) greeting = "I am a Labrodor!";
        else if (this instanceof Bulldog) greeting = "I am a Bulldog!";
        else greeting = "I am a dog of unknown breed!";
        /*if (this.breed == DogBreeds.LABRADOR) greeting = "Af-Af";
        if (this.breed == DogBreeds.BULLDOG) greeting = "Roof";
        if (this.breed == DogBreeds.FOX_TERRIER) greeting = "Tiaf-Tiaf"; */
        String nameAndType = super.toString(); // Вызов родительского метода. Super - это родитель.
        return nameAndType + " I'am a dog. " + greeting + " My weight is " + this.weight + " kg. ";
    }
}
