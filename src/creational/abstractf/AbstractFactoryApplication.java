package creational.abstractf;

import creational.abstractf.banking.BankingTeamFactory;

public class AbstractFactoryApplication {
  public static void main(String[] args) {
    ProjectTeamFactory factory = new BankingTeamFactory();
    factory.getDeveloper().writeCode();
    factory.getProjectManager().manageProject();
    factory.getTester().testCode();
  }
}
