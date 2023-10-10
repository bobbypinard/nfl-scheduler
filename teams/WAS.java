
public class WAS extends Team{

  public static void main(String args[]){
    String id = "WAS";
    String name = "Washington Commanders";
    String location = "Landover, MD";
    String stadium = "FedEx Field";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
