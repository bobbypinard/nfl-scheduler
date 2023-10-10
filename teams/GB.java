
public class GB extends Team{

  public static void main(String args[]){
    String id = "GB";
    String name = "Green Bay Packers";
    String location = "Green Bay, WI";
    String stadium = "Lambeau Field";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
