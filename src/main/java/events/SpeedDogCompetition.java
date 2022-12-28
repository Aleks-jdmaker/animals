package events;

import animals.Dog;

public class SpeedDogCompetition extends DogCompetition{
    public SpeedDogCompetition(Dog first, Dog second, Dog third) {

        super(first, second, third, Emodji.DOG);
    }

    @Override
    public void fight() {
        double firstSpeed = this.first.getSpeed();
        double secondSpeed = this.second.getSpeed();
        double thirdSpeed = this.third.getSpeed();
        double maxSpeed = Math.max(firstSpeed, secondSpeed);
        maxSpeed = Math.max(maxSpeed, thirdSpeed);
        System.out.println(getGreeting());
        System.out.println("_________________________");
        System.out.println("first: " + getStars(firstSpeed));
        System.out.println("second: " + getStars(secondSpeed));
        System.out.println("third: " + getStars(thirdSpeed));
        if (maxSpeed == firstSpeed) System.out.println("The first dog WON!");
        else if (maxSpeed == secondSpeed) System.out.println("The second dog WON!");
        else System.out.println("The third dog WON!");
    }
}
