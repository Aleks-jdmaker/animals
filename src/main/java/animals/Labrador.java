package animals;

public class Labrador extends Dog{
    public Labrador(String name) throws IllegalAccessException {
        super(name);
        setBreed(DogBreeds.LABRADOR); // Обращение к методу, который раньше был абстрактным.
    }

    @Override
    void setBreed(DogBreeds breed) throws IllegalAccessException { // Реализация абстрактного метода.
        if(this.breed != null) throw new IllegalAccessException("The breed can be defined only once!");
        this.breed = breed;
        this.weight = 50;
    }
}
