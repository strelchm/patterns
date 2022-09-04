package creational.abstractf;

public interface ProjectTeamFactory {
  Developer getDeveloper();
  Tester getTester();
  ProjectManager getProjectManager();
}
