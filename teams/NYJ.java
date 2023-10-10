
public class NYJ extends Team{

  public static void main(String args[]){
    String id = "NYJ";
    String name = "New York Jets";
    String location = "East Rutherford, NJ";
    String stadium = "Metlife Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
