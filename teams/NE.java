
public class NE extends Team{

  public static void main(String args[]){
    String id = "NE";
    String name = "New England Patriots";
    String location = "Foxborough, MA";
    String stadium = "Gillette Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
