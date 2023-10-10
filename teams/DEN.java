
public class DEN extends team{
  
  public static void main(String args[]){
    String id = "DEN";
    String name = "Denver Broncos";
    String location = "Denver, CO";
    String stadium = "Empower Field";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
