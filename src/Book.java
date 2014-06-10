package src;

/**
 * A class called circle is designed as shown in the following class diagram. It contains:
 * 
 * 1) Two private instance variables: radius (of type double) and color (of type String),
 *    with default value of 1.0 and "red", respectively.
 * 2) Two overloaded constructors;
 * 3) Two public methods: getRadius() and getArea().
 * 
 * The source codes for Circle is as follows:
 */

public class Book {
   
   private String name;
   private double price;
   private Author author;
   private int    qtyInStock = 0;

   public Book (String name, Author author, double price) {
      this.name   = name;
      this.author = author;
      this.price  = price;
   }

   public Book (String name, Author author, double price, int qtyInStock) {
      this.name       = name;
      this.author     = author;
      this.price      = price;
      this.qtyInStock = qtyInStock;
   }

   public String getName() {
      return this.name;
   }

   public Author getAuthor() {
      return this.author;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getQtyInStock() {
      return this.qtyInStock;
   }

   public void setQtyInStock(int qtyInStock) {
      this.qtyInStock = qtyInStock;
   }

   public String toString() {
      return "'" + name +"' by " + author;
   }
}