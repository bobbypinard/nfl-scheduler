
public class IND extends Team{

  public static void main(String args[]){
    String id = "IND";
    String name = "Indianapolis Colts";
    String location = "Indianapolis, IN";
    String stadium = "Lucas Oil Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
