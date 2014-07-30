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

public class Book2 {
   
   private String   name;
   private double   price;
   private Author[] authors;
   private int      qtyInStock = 0;

   public Book2(String name, Author[] authors, double price) {
      this.name    = name;
      this.authors = authors;
      this.price   = price;
   }

   public Book2(String name, Author[] authors, double price, int qtyInStock) {
      this.name       = name;
      this.authors    = authors;
      this.price      = price;
      this.qtyInStock = qtyInStock;
   }

   public String getName() {
      return this.name;
   }

   public double getPrice() {
      return this.price;
   }

   public Author[] getAuthors() {
      return this.authors;
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

   public void printAuthors() {
      int authorNo = 0;
      for (Author a : this.authors) {
         System.out.println("("+(++authorNo)+") "+a);
      }
   }

   public String toString() {
      return "'" + name +"' by " + authors.length + " authors";
   }   
}