package animals;

public abstract class Dog extends Predator{
    protected DogBreeds breed; // Поле доступно для класска Dog и его потомков.
    protected int weight;
    public Dog(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String greeting = null;
        if (this.breed == DogBreeds.LABRADOR) greeting = "Af-Af";
        if (this.breed == DogBreeds.BULLDOG) greeting = "Roof";
        if (this.breed == DogBreeds.FOX_TERRIER) greeting = "Tiaf-Tiaf";
        String nameAndType = super.toString(); // Вызов родительского метода. Super - это родитель.
        return nameAndType + " I'am a dog. My weight is " + this.weight + " " + greeting;
    }
    abstract void setBreed(DogBreeds breed) throws IllegalAccessException; // Метод объявлен, но нереализован.
}
