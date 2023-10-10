
public class TEN extends Team{

  public static void main(String args[]){
    String id = "TEN";
    String name = "Tennessee Titans";
    String location = "Nashville, TN";
    String stadium = "Nissan Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
