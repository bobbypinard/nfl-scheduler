
public class CHI extends Team{

  public static void main(String args[]){
    String id = "CHI";
    String name = "Chicago Bears";
    String location = "Chicago, IL";
    String stadium = "Soldier Field";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
