
public class BLT extends Team{

  public static void main(String args[]){
    String id = "BLT";
    String name = "Baltimore Ravens";
    String location = "Baltimore, MD";
    String stadium = "M&T Bank Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
