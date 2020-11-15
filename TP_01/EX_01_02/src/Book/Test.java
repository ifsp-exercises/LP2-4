package Book;

import Author.Author;

public class Test {
  private static void printOk() {
    System.out.println("Ok ✅\n");
  }

  public static void printError(String message) {
    System.out.println("❌  An error occurred: " + message + "\n");
  }

  private static void testBook(Book book, String title, boolean shouldPass) throws Exception {
    System.out.println("     " + title);
    System.out.println("--------------------");
    System.out.println("What is expected? " + (shouldPass ? "To be passed." : "To be failed"));
    System.out.println();

    System.out.println("Trying to show book's information...");
    System.out.println(book.toString());
    printOk();

    System.out.println("Trying to update book's name...");
    book.setName("Another book on the world");
    System.out.println(book.toString());
    printOk();

    System.out.println("Trying to update book's price...");
    book.setPrice(43.89);
    System.out.println(book.toString());
    printOk();

    System.out.println("Trying to update book's quantity...");
    book.setQuantity(28);
    ;
    System.out.println(book.toString());
    printOk();

    System.out.println("Trying to show separated book's information...");
    System.out.println("Name: " + book.getName() + " ✅");
    System.out.println("Price: " + book.getPrice() + " ✅");
    System.out.println("Quantity: " + book.getQuantity() + " ✅");
    System.out.println("Authors: " + book.getAuthorNames() + " ✅");

    System.out.println("\n");
    System.out.println("Result: " + "Everything is OK ✅\n\n");
  }

  public static void main(String[] args) {
    try {
      Author[] authors = new Author[] { 
        new Author("Angelo", "angeloevan.ane@gmail.com", 'm'), 
        new Author("Anna", "anna.str@gmail.com", 'f'), 
      };

      testBook(new Book("A nice book", 40.00, authors), "Test 1", true);
    } catch (Exception exception) {
      printError(exception.getMessage());
    }
  }
}
