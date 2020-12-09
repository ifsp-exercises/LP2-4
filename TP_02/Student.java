import java.util.UUID;

public class Student {
  private UUID uuid;
  private int age;
  private String name;
  private String address;

  public Student(String name,String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
    this.uuid = UUID.randomUUID();
  }

  public void setUUID(UUID uuid) {
    this.uuid = uuid;
  }

  public UUID getUUID() {
    return this.uuid;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAdress() {
    return this.address;
  }
}
