
public class KC extends Team{

  public static void main(String args[]){
    String id = "KC";
    String name = "Kansas City Chiefs";
    String location = "Kansas City, MO";
    String stadium = "Arrowhead Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
