package animals;

public class Labrador extends Dog{
    public Labrador(String name) {
        super(name);
        setBreed(DogBreeds.LABRADOR);
    }

    @Override
    void setBreed(DogBreeds breed) {
        this.breed = breed;
        this.weight = 50;
    }
}
