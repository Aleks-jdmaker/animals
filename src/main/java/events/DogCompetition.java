package events;

import animals.Dog;

import java.util.List;

public abstract class DogCompetition {
    public static final double MAX_FACTOR = 1.5;
    public static final String ILLEGAL_WEIGHT = "Собаки должны быть в одной весовой категории!";
    protected final Dog first;
    protected final Dog second;
    protected final Dog third;

    protected String emodji;

    public static String getEmodji(Emodji emodji){
        return switch (emodji){
            case DOG -> "\uD83D\uDC15";
            case CUP -> "\uD83C\uDFC6";
            case STAR -> "⭐";
            case POLICE -> "\uD83D\uDC6E";
            default -> "❌";
        };
    }
    public DogCompetition(List<Dog> dogs){
        // TODO: реализовать конструктор с произвольным количеством участников (собак).
    }

    public DogCompetition(Dog first, Dog second, Dog third, Emodji emodji) {
        double maxWeight = Math.max(first.getWeight(), second.getWeight());
        double minWeight = Math.min(first.getWeight(), second.getWeight());
        if(maxWeight / minWeight > MAX_FACTOR) throw new IllegalStateException(ILLEGAL_WEIGHT + " (#1 и 2)");
        maxWeight = Math.max(third.getWeight(), second.getWeight());
        minWeight = Math.min(third.getWeight(), second.getWeight());
        if(maxWeight / minWeight > MAX_FACTOR) throw new IllegalStateException(ILLEGAL_WEIGHT + " (#2 и 3)");
        maxWeight = Math.max(first.getWeight(), third.getWeight());
        minWeight = Math.min(first.getWeight(), third.getWeight());
        if (maxWeight / minWeight > MAX_FACTOR) throw new IllegalStateException(ILLEGAL_WEIGHT + " (#1 и 3)");
        this.first = first;
        this.second = second;
        this.third = third;
        this.emodji = getEmodji(emodji);
    }
    protected String getGreeting(){
        return first + "\n" + second + "\n" + third;
    }
    protected String getStars(Double amount){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amount; i++) sb.append(this.emodji);
        return sb.toString();
    }
    public abstract void fight(); //
}
