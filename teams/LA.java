
public class LA extends Team{

  public static void main(String args[]){
    String id = "LA";
    String name = "Los Angeles Rams";
    String location = "Inglewood, CA";
    String stadium = "SoFi Stadium";
    String[] schedule = {"Week 1: Home against Philadelphia Eagles", "Week 2: Away at Houston Texans"};

    System.out.println(name);

    for(String i: schedule){
      System.out.println(i);
    }
  }
}
