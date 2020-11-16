package Person;

public class Staff extends Person {
  private String school;
  private double pay;

  private static String toStringTemplate = "Staff[%s,school=%s,pay=%s]";

  public Staff(String name, String address, String school, double pay) {
    super(name, address);
    this.school = school;
    this.pay = pay;
  } 

  public String getSchool() {
    return this.school;
  }

  public double getPay() {
    return this.pay;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  @Override
  public String toString() {
    return String.format(toStringTemplate, super.toString(), this.school, this.pay);
  }
}