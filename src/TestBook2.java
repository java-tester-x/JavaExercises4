package src;

public class TestBook2 {

    public static void main(String[] args)
    {
        Author[] authors = new Author[2];
        authors[0] =  new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        authors[1] =  new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book2 aBook = new Book2("Java for dummy", authors, 19.95, 1000);

        // Use an anonymous instance of Author
        Book2 anotherBook = new Book2(
            "more Java for dummy"
            , new Author[] {
                    new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm')
                ,   new Author("Paul Tan", "Paul@nowhere.com", 'm')
            }
            , 29.95, 888);

        // additional task #1
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        System.out.println("\nThe book: " + anotherBook);
        System.out.println("The authors are:");
        anotherBook.printAuthors();
    }
}   