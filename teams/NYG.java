
public class NYG extends Team{

  public static void main(String args[]){
    String id = "NYG";
    String name = "New York Giants";
    String location = "East Rutherford, NJ";
    String stadium = "Metlife Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
