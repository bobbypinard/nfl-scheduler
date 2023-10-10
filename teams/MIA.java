
public class MIA extends Team{

  public static void main(String args[]){
    String id = "MIA";
    String name = "Miami Dolphins";
    String location = "Miami Gardens, FL";
    String stadium = "Hard Rock Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
