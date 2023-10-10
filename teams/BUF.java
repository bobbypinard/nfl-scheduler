
public class BUF extends Team{

  public static void main(String args[]){
    String id = "BUF";
    String name = "Buffalo Bills";
    String location = "Orchard Park, NY";
    String stadium = "Highmark Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
