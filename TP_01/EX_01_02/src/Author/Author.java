package Author;

import java.util.Arrays;
import java.util.List;

public class Author {
  private static List<Character> validGenders = Arrays.asList('f', 'm');
  private static String toStringTemplate = "Author[name=%s,email=%s,gender=%c]";

  private String name;
  private String email;
  private Character gender;

  public static List<Character> getValidGenders() {
    return validGenders;
  }

  public static boolean isValidGender(char gender) {
    return validGenders.indexOf(gender) != -1;
  }

  public static boolean isValidEmailAddress(String email) {
    char[] emailCharacters = email.toCharArray();

    int countOfAts = 0;

    for (char character : emailCharacters) {
      if (character == '@') {
        countOfAts++;
      }
    }

    if (countOfAts == 0 || countOfAts > 1) {
      return false;
    }

    boolean hasDot = email.indexOf('.') != -1;

    return hasDot;
  }

  public Author(String name, String email, char gender) throws Exception {
    if (!isValidGender(gender)) {
      throw new Exception("Invalid gender for Author.");
    }

    if (!isValidEmailAddress(email)) {
      throw new Exception("Invalid email address.");
    }

    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public char getGender() {
    return this.gender;
  }

  public void setEmail(String email) throws Exception {
    if (!isValidEmailAddress(email)) {
      throw new Exception("Invalid email address.");
    }

    this.email = email;
  }

  @Override()
  public String toString() {
    return String.format(toStringTemplate, this.name, this.email, this.gender);
  }
}