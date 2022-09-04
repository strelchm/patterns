package creational.prototype;

public class PrototypeApplication {
  public static void main(String[] args) {
    Project master = new Project(1, "name", "source code 1");
    System.out.println(master);

    ProjectFactory factory = new ProjectFactory(master);
    Project copy = factory.cloneProject();
    System.out.println(copy);
  }
}