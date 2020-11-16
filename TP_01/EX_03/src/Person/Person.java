package Person;

public class Person {
  private String name;
  private String address;

  private static String toStringTemplate = "Person[name=%s,address=%s]";

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return String.format(toStringTemplate, this.name, this.address);
  } 
}