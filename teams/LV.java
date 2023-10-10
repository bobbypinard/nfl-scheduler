
public class LV extends Team{

  public static void main(String args[]){
    String id = "LV";
    String name = "Los Vegas Raiders";
    String location = "Paradise Nevada";
    String stadium = "Allegiant Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
