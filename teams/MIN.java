
public class MIN extends Team{

  public static void main(String args[]){
    String id = "MIN";
    String name = "Minnasota Vikings";
    String location = "Minneapolis, MN";
    String stadium = "U.S. Bank Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
