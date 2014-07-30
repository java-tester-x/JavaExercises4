package src;

public class TestBook3 {

    public static void main(String[] args)
    {
        Book3 aBook = new Book3("Java for dummy", 19.95, 1000);
        aBook.addAuthor(new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'));
        aBook.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));

        // additional task #1
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        aBook.addAuthor(new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm'));
        aBook.addAuthor(new Author("Kris Datel", "k.datel@somewhere.com", 'm'));
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        aBook.removeAuthorByName("Bruce Eckel");
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        aBook.addAuthor(new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm'));
        aBook.addAuthor(new Author("Paul Tan Junior", "PaulJunior@nowhere.com", 'm'));
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        // ATTENTION: here new author wouldn't be added !!! NO errors - see code of Book3.java
        aBook.addAuthor(new Author("Bruce Eckel Junior", "b.eckel-junior@nowhere.com", 'm'));
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

    }
}   