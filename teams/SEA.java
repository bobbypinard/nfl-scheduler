
public class SEA extends Team{

  public static void main(String args[]){
    String id = "SEA";
    String name = "Seattle Seahawks";
    String location = "Seattle, WA";
    String stadium = "Lumen Field";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
