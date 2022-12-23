package events;

import animals.Dog;

public abstract class DogCompetition {
    public static final double MAX_FACTOR = 1.5;
    protected final Dog first;
    protected final Dog second;

    public DogCompetition(Dog first, Dog second) {
        double maxWeight = Math.max(first.getWeight(), second.getWeight());
        double minWeight = Math.min(first.getWeight(), second.getWeight());
        if(maxWeight / minWeight > MAX_FACTOR) throw new IllegalStateException("Dogs must be in the same weight class.");
        this.first = first;
        this.second = second;
    }
    public abstract void fight();
}
