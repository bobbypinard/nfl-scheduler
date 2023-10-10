
public class DAL extends Team{

  public static void main(String args[]){
    String id = "DAL";
    String name = "Dallas Cowboys";
    String location = "Arlington, TX";
    String stadium = "AT&T Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
