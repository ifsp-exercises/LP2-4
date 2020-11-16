package Person;

public class Test {
  private static void printOk() {
    System.out.println("Ok ✅\n");
  }

  public static void printError(String message) {
    System.out.println("❌  An error occurred: " + message + "\n");
  }

  private static <Type extends Person> void testPerson(Type person, String title, boolean shouldPass) throws Exception {
    System.out.println("     " + title);
    System.out.println("--------------------");
    System.out.println("What is expected? " + (shouldPass ? "To be passed." : "To be failed"));
    System.out.println();

    System.out.println("Trying to show person's information...");
    System.out.println(person.toString());
    printOk();

    System.out.println("Trying to update person's address...");
    person.setAddress("Another address on the world");
    System.out.println(person.toString());
    printOk();

    System.out.println("Trying to show separated person's information...");
    System.out.println("Name: " + person.getName() + " ✅");
    System.out.println("Address: " + person.getAddress() + " ✅");

    if (person instanceof Student) {
      System.out.println("Trying to update student's program...");
      ((Student) person).setProgram("Another program");
      System.out.println(person.toString());
      printOk();

      System.out.println("Trying to update student's year...");
      ((Student) person).setYear(9001);
      System.out.println(person.toString());
      printOk();

      System.out.println("Trying to update student's fee...");
      ((Student) person).setFee(2000);
      System.out.println(person.toString());
      printOk();

      System.out.println("Trying to show separated person's information...");
      System.out.println("Name: " + ((Student) person).getName() + " ✅");
      System.out.println("Address: " + ((Student) person).getAddress() + " ✅");
      System.out.println("Program: " + ((Student) person).getProgram() + " ✅");
      System.out.println("Year: " + ((Student) person).getYear() + " ✅");
      System.out.println("Fee: " + ((Student) person).getFee() + " ✅");
    }

    if (person instanceof Staff) {
      System.out.println("Trying to update student's school...");
      ((Staff) person).setSchool("Another school");
      System.out.println(person.toString());
      printOk();

      System.out.println("Trying to update student's pay...");
      ((Staff) person).setPay(2000);
      System.out.println(person.toString());
      printOk();

      System.out.println("Trying to show separated person's information...");
      System.out.println("Name: " + ((Staff) person).getName() + " ✅");
      System.out.println("Address: " + ((Staff) person).getAddress() + " ✅");
      System.out.println("School: " + ((Staff) person).getSchool() + " ✅");
      System.out.println("Pay: " + ((Staff) person).getPay() + " ✅");
    }

    System.out.println("\n");
    System.out.println("Result: " + "Everything is OK ✅\n\n");
  }

  public static void main(String[] args) {
    try {
      testPerson(new Person("Person to test", "Person's House"), "Test 1", true);
    } catch (Exception exception) {
      printError(exception.getMessage());
    }

    try {
      testPerson(new Student("Student to test", "Student's House", "Program", 2001, 1000), "Test 2", true);
    } catch (Exception exception) {
      printError(exception.getMessage());
    }

    try {
      testPerson(new Staff("Student to test", "Staff's House", "School", 2000), "Test 3", true);
    } catch (Exception exception) {
      printError(exception.getMessage());
    }
  }
}
