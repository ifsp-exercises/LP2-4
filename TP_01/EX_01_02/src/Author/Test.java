package Author;

public class Test {
  private static final String authorJsonString = "{\n  \"name\": \"%s\",\n  \"email\": \"%s\",\n  \"gender\": \"%c\"\n}";

  private static void printOk() {
    System.out.println("Ok ✅\n");
  }

  public static void printError(String message) {
    System.out.println("❌  An error occurred: " + message + "\n");
  }

  private static void testAuthor(String name, String email, char gender, String title, boolean shouldPass)
      throws Exception {
    System.out.println("     " + title);
    System.out.println("--------------------");
    System.out.println("What is expected? " + (shouldPass ? "To be passed." : "To be failed"));

    Author author = null;

    System.out.println("\n");
    System.out.print("\"enteredData\": ");
    System.out.println(String.format(authorJsonString, name, email, gender));

    System.out.println("\n");

    System.out.println("Trying to create instance of \"Author\"...");
    author = new Author(name, email, gender);
    printOk();

    System.out.println("Trying to show author's information...");
    System.out.println(author.toString());
    printOk();

    System.out.println("Trying to update author's email address...");
    author.setEmail("another.common@email.com");
    System.out.println(author.toString());
    printOk();

    System.out.println("Trying to show separated author's information...");
    System.out.println("Name: " + author.getName() + " ✅");
    System.out.println("Email: " + author.getEmail() + " ✅");
    System.out.println("Gender: " + author.getGender() + " ✅");

    System.out.println("\n");
    System.out.println("Result: " + "Everything is OK ✅\n\n");
  }

  public static void main(String[] args) {
    try {
      testAuthor("Angelo", "angeloevan.ane@gmail.com", 'm', "Test 1", true);
    } catch (Exception exception) {
      printError(exception.getMessage());
    }

    try {
      testAuthor("Angelo", "angeloevan.ane@gmail.com", 'a', "Test 2", false);
    } catch (Exception exception) {
      printError(exception.getMessage());
    } finally {
      System.out.println("----------------------------------------");
    }

    try {
      testAuthor("Angelo", "angeloevananegmail.com", 'm', "Test 3", false);
    } catch (Exception exception) {
      printError(exception.getMessage());
    } finally {
      System.out.println("----------------------------------------");
    }

    try {
      testAuthor("Angelo", "angeloevan@gmail", 'm', "Test 4", false);
    } catch (Exception exception) {
      printError(exception.getMessage());
    } finally {
      System.out.println("----------------------------------------");
    }
  }
}
