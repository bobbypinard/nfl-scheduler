
public class SF extends Team{

  public static void main(String args[]){
    String id = "SF"
    String name = "San Francisco 49ers";
    String location = "Santa Clara, CA";
    String stadium = "Levi's Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
