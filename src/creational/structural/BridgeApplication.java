package creational.structural;

import creational.factory.CDeveloper;
import creational.factory.JavaDeveloper;

public class BridgeApplication {
  public static void main(String[] args) {
    Program[] programs = {
        new BankSystem(new JavaDeveloper()),
        new StockExchange(new CDeveloper())
    };

    for (Program program : programs) {
      program.develop();
    }

  }
}
