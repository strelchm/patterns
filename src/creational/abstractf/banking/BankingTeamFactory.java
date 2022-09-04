package creational.abstractf.banking;

import creational.abstractf.Developer;
import creational.abstractf.ProjectManager;
import creational.abstractf.ProjectTeamFactory;
import creational.abstractf.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
  @Override
  public Developer getDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public Tester getTester() {
    return new QATester();
  }

  @Override
  public ProjectManager getProjectManager() {
    return new BankingPM();
  }
}
