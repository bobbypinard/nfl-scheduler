
public class CIN extends Team{

  public static void main(String args[]){
    String id = "CIN";
    String name = "Cincinnati Bengals";
    String location = "Cinncinati, OH";
    String stadium = "Paycor Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
