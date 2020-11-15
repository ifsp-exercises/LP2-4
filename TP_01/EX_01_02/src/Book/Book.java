package Book;

import Author.Author;

public class Book {
  private static String toStringTemplate = "Book[name=%s,price=%f,quantity=%o,authors={%s}]";

  private String name;
  private double price;
  private int quantity;
  private Author[] authors;

  public Book(String name, double price, Author[] authors) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.quantity = 0;
  }

  public Book(String name, double price, Author[] authors, int quantity) {
    this(name, price, authors);
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public Author[] getAuthors() {
    return this.authors;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getAuthorNames() 
  {
    String authorNamesString = "";

    for (Author author : this.authors) {
      authorNamesString += (authorNamesString.length() != 0)
      ? "," + author.getName()
      : author.getName();
    }

    return authorNamesString;
  }

  @Override
  public String toString() {
    String authorsString = "";

    for (Author author : this.authors) {
      authorsString += (authorsString.length() != 0)
      ? "," + author.toString()
      : author.toString();
    }

    return String.format(
      toStringTemplate, 
      this.name, 
      this.price, 
      this.quantity, 
      authorsString
    );
  }
}