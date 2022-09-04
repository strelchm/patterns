package creational.abstractf.banking;

import creational.abstractf.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Java code...");
  }
}
