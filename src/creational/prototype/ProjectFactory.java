package creational.prototype;

public class ProjectFactory {
  Project project;

  public ProjectFactory(Project project) {
    this.project = project;
  }

  public void setProject() {
    this.project = project;
  }

  Project cloneProject() {
    return (Project) project.copy();
  }
}
