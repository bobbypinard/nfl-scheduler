
public class PIT extends Team{

  public static void main(String args[]){
    String id = "PIT";
    String name = "Pittsburgh Steelers";
    String location = "Pittsburgh, PA";
    String stadium = "Arrowhead Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
