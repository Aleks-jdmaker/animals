package events;

import animals.Dog;

public class SpeedDogCompetition extends DogCompetition{
    public SpeedDogCompetition(Dog first, Dog second) {
        super(first, second);
    }

    @Override
    public void fight() {
        double firstSpeed = this.first.getSpeed();
        double maxSpeed = Math.max(firstSpeed, this.second.getSpeed());
        System.out.println("The first dog: " + this.first);
        System.out.println("The second dog: " + this.second);
        System.out.println("_________________________");
        if (maxSpeed == firstSpeed) System.out.println("The first dog WON!");
        else System.out.println("The second dog WON!");
    }
}
