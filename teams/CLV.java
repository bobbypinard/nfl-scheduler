
public class CLV extends Team{

  public static void main(String args[]){
    String id = "CLV";
    String name = "CLeveland Browns";
    String location = "Cleveland, OH";
    String stadium = "Cleveland Browns Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
