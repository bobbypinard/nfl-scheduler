
public class NO extends Team{

  public static void main(String args[]){
    String id = "NO";
    String name = "New Orleans Saints";
    String location = "New Orleans, LA";
    String stadium = "Caesar's Superdome";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
