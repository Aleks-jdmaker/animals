package animals;

public class Bulldog extends Dog{
    public Bulldog(String name) {
        super(name);
        this.setBreed(DogBreeds.BULLDOG);
    }

    @Override
    void setBreed(DogBreeds breed) {
        this.breed = breed;
        this.weight = 10;
    }
}
