
public class ARZ extends Team{

  public static void main(String args[]){
    String id = "ARZ";
    String name = "Arizona Cardinals";
    String location = "Glendale AZ";
    String stadium = "Atate Farm Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
