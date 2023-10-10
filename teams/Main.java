import java.util.*;

public class Main {
  public static void main(String args[]){
    Week[] season = new Week[18];
    //season[6].setWeekNumber(6);
    //System.out.println(season[6].getWeekNumber());

    for(int i = 0; i < season.length; i++){
      season[i] = new Week();
      season[i].setWeekNumber(i + 1);
      season[i].setAwayTeam("HST");
      season[i].setHomeTeam("KC");
      System.out.println(season[i].toString());
    }

    //for(int i = 0; i < season.length; i++){
      //System.out.println(season[1].toString());
    //}
  }
}
