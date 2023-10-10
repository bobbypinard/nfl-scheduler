
public class CAR extends Team{

  public static void main(String args[]){
    String id = "CAR";
    String name = "Carolina Panthers";
    String location = "Charlotte, NC";
    String stadium = "Bank of America Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
