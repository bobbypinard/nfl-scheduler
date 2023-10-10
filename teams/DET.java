
public class DET extends Team{

  public static void main(String args[]){
    String id = "DET";
    String name = "Detroit Lions";
    String location = "Detroit, MI";
    String stadium = "Ford Field";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
