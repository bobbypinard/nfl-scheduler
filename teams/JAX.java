
public class JAX extends Team{ 

  public static void main(String args[]){
    String id = "JAX";
    String name = "Jacksonville Jaguars";
    String location = "Jacksonville, FL";
    String stadium = "Everbank Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
