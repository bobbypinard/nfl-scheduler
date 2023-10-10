
public class ATL extends Team{

  public static void main(String args[]){
    String id = "ATL";
    String name = "Atlanta Falcons";
    String location = "Atlanta, GA";
    String stadium = "Mercedez-Benz Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
