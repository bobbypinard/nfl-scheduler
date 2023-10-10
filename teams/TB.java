
public class TB extends Team{

  public static void main(String args[]){
    String id = "TB";
    String name = "Tampa Bay Buccaneers";
    String location = "Tampa, FL";
    String stadium = "Raymond James Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
