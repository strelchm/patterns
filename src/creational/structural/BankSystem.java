package creational.structural;


import creational.factory.Developer;

public class BankSystem extends Program {
  public BankSystem(Developer developer) {
    super(developer);
  }

  @Override
  void develop() {
    System.out.println("Bank system development in progress...");
    developer.writeCode();
  }
}
