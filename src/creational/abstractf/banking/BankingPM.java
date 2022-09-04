package creational.abstractf.banking;

import creational.abstractf.ProjectManager;

public class BankingPM implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Manage bank project...");
  }
}
