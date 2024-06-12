public class Feeder {
  private int curretnFood;

  public Feeder(int food){
    curretnFood = food;
  }

  public void simulateOneDay(int numBirds){
    int chance = (int) (Math.random()*100)+1;

    if (chance <= 95){
      int eaten = ((int) (Math.random()*41)+10) * numBirds;
      if (eaten > curretnFood){
        curretnFood = 0;
      }
      else {
        curretnFood = curretnFood - eaten;
      }
    }
    else {
      curretnFood = 0;
      System.out.println("A bear ate all the food");
    }
    
  }

  public int simulateManyDays(int numBirds, int numDays){
    for (int i = 0; i < numDays; i++){
      if (curretnFood == 0){
        return i;
      }
      simulateOneDay(numBirds);
      
    }
    return numDays;
  }

  public int getFood(){
    return curretnFood;
  }
}
