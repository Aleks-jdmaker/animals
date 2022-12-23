import animals.*;
import events.DogCompetition;
import events.SpeedDogCompetition;

import java.sql.SQLOutput;
import java.util.List; // Список объектов. Это интерфейс (абстрактный тип) им нельзя пользоваться напрямую.
import java.util.ArrayList; // Реализация списка. Можно создавать экземпляры (инстансы).

public class Main {
       public static void main(String[] args) {
           Dog ball = new Bulldog("Ball");
           Dog sharik = new Bulldog("Sharik");
           DogCompetition competition = new SpeedDogCompetition(ball, sharik);
           competition.fight(); //Сравнить скорости собак и вывести на экран.
    }
}
