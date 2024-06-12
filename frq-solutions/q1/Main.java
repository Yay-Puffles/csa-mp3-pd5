public class Main {
  public static void main(String[] args) {
    System.out.println("2024 FRQ #1");
    System.out.println();

    Feeder f1 = new Feeder(500);
    f1.simulateOneDay(12);
    System.out.println("There is "+f1.getFood()+" food remaining");
    System.out.println();
    
    Feeder f2 = new Feeder(1000);
    f2.simulateOneDay(22);
    System.out.println("There is "+f2.getFood()+" food remaining");
    System.out.println();
    
    Feeder f3 = new Feeder(100);
    f3.simulateOneDay(5);
    System.out.println("There is "+f3.getFood()+" food remaining");
    System.out.println();

    Feeder f4 = new Feeder(2400);
    System.out.println("Food was in the feeder for "+f4.simulateManyDays(10,4)+" days");
    System.out.println();

    Feeder f5 = new Feeder(250);
    System.out.println("Food was in the feeder for "+f5.simulateManyDays(10,5)+" days");
    System.out.println();

    Feeder f6 = new Feeder(0);
    System.out.println("Food was in the feeder for "+f6.simulateManyDays(5,10)+" days");
  }
}
