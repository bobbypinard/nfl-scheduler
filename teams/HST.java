
public class HST extends Team{

  public static void main(String args[]){
    String id = "HST";
    String name = "Houston Texans";
    String location = "Houston, TX";
    String stadium = "NRG Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
