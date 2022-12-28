package events;

import animals.Dog;

public class StarDogCompetition extends SpeedDogCompetition{

    public StarDogCompetition(Dog first, Dog second, Dog third) {
        super(first, second, third);
        this.emodji = DogCompetition.getEmodji(Emodji.STAR);
    }
}
