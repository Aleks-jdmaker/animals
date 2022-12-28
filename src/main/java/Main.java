import animals.*;
import events.DogCompetition;
import events.Emodji;
import events.SpeedDogCompetition;
import events.StarDogCompetition;

import java.sql.SQLOutput;
import java.util.List; // Список объектов. Это интерфейс (абстрактный тип) им нельзя пользоваться напрямую.
import java.util.ArrayList; // Реализация списка. Можно создавать экземпляры (инстансы).

public class Main {
       public static void main(String[] args) {
           try {
               Dog ball = new Bulldog("Мячик");
               Dog sharik = new Bulldog("Шарик");
               Dog tuzik = new Bulldog("Тузик");
               DogCompetition competition = new SpeedDogCompetition(ball, tuzik, sharik);
               competition.fight();
               competition = new StarDogCompetition(ball, tuzik, sharik);
               competition.fight();
           }
           catch (IllegalStateException exception){
               String police = DogCompetition.getEmodji(Emodji.POLICE);
               System.out.println(police + exception.getMessage());
           }
    }
}
