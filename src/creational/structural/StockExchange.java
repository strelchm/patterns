package creational.structural;


import creational.factory.Developer;

public class StockExchange extends Program {
  public StockExchange(Developer developer) {
    super(developer);
  }

  @Override
  void develop() {
    System.out.println("Stock exchange development...");
    developer.writeCode();
  }
}
