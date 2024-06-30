public class BookDemo {
    public static void main(String[] args) {
        // Creating different books using constructor overloading
        Book javaBook = new Book("Java Programming", "John Doe", 2020);
        Book algorithmBook = new Book("Introduction to Algorithms", "Thomas Cormen");
        Book emptyBook = new Book();

        // Displaying book details
        javaBook.displayDetails();
        algorithmBook.displayDetails();
        emptyBook.displayDetails();
    }
}
