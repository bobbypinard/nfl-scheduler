public class Scheduler{
  public static void main(String args[]){
    System.out.println("Hello world!");
  }

  public static int[] fisherYates(int[] ray){
    int[] shuffledArray = ray;
    int placeholder;

    for(int i = ray.length-1; i >= 0; i--){
      int randInt = (int) ((Math.random() * (i - 0)) + 0);
      placeholder = shuffledArray[i];
      shuffledArray[randInt] = shuffledArray[i];
      shuffledArray[i] = placeholder;
    }
    
    return shuffledArray;
  }
}
