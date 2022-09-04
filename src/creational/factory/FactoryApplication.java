package creational.factory;

public class FactoryApplication {
  public static void main(String[] args) {
    DeveloperFactory javaDeveloperFactory = getDeveloperFactory(Speciality.JAVA);
    DeveloperFactory cDeveloperFactory = getDeveloperFactory(Speciality.C);

    Developer javaDeveloper = javaDeveloperFactory.createDeveloper();
    Developer cDeveloper = cDeveloperFactory.createDeveloper();

    javaDeveloper.writeCode();
    cDeveloper.writeCode();
  }

  enum Speciality {
    JAVA,
    C;
  }

  static DeveloperFactory getDeveloperFactory(Speciality speciality) {
    return switch (speciality) {
      case C -> new CDeveloperFactory();
      case JAVA -> new JavaDeveloperFactory();
      default -> throw new UnsupportedOperationException("Unsupported speciality " + speciality);
    };
  }
}
