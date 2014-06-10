package src;

public class TestBook {

    public static void main(String[] args)
    {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);

        // Use an anonymous instance of Author
        Book anotherBook = new Book(
            "more Java for dummy"
            , new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm')
            , 29.95, 888);
    }
}   