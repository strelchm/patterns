package creational.structural;


import creational.factory.Developer;

public abstract class Program {
  protected final Developer developer;

  protected Program(Developer developer) {
    this.developer = developer;
  }

  abstract void develop();

}
