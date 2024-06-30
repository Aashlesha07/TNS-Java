class Book {
    String title;
    String author;
    int yearPublished;

    // Constructor for non-fiction books
    Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Constructor for fiction books
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = -1; // default value for unspecified year
    }

    // Constructor for generic books with no details
    Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.yearPublished = -1;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (yearPublished != -1) {
            System.out.println("Year Published: " + yearPublished);
        } else {
            System.out.println("Year Published: Unknown");
        }
        System.out.println();
    }
}