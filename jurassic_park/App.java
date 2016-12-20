package jurrasic_park;

public class App {

  Park park;
  int dayCounter;

  public App(Park park) {
    this.park = park;
    this.dayCounter = 1;
  }

  public int getDay() {
    return this.dayCounter;
  }

  public void nextDay() {
    this.dayCounter += 1;
  }

  public String index() {

    System.out.println("Day " + getDay());
    System.out.println("-------Menu-------\n" );
    System.out.println("View Enclosures (e)");
    System.out.println("View Dinosaurs (d)");
    System.out.println("View Funds (f)");
    System.out.println("View Visitor Numbers (v)");
    System.out.println("Buy Dinosaur (e)");
    System.out.println("What would you like to do?");

  }







  // public void nextTurn() {
  //   //park.nextDay();
  //   park.setPopularityLevel();
  //   park.allDinosaursTakeACrap();
  //   park.rampageCheck();
  //   park.calculateVisitorsAndFunds();
  //   System.out.println("Day " + getDay());
  //   //park.statusUpdate?
  // }


  public void play() {
    index();
  }

}