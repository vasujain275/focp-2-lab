package Practical08.Question03;

class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void borrowBook() throws BookAlreadyBorrowedException {
        if (isBorrowed) {
            throw new BookAlreadyBorrowedException("Book '" + title + "' is already borrowed.");
        }
        isBorrowed = true;
    }

    public void returnBook() throws BookNotBorrowedException {
        if (!isBorrowed) {
            throw new BookNotBorrowedException("Book '" + title + "' is not borrowed.");
        }
        isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}

class BookAlreadyBorrowedException extends Exception {
    public BookAlreadyBorrowedException(String message) {
        super(message);
    }
}

class BookNotBorrowedException extends Exception {
    public BookNotBorrowedException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "John Smith");
        try {
            book1.borrowBook();
            System.out.println("Book '" + book1.getTitle() + "' by " + book1.getAuthor() + " is borrowed.");
            book1.returnBook();
            System.out.println("Book '" + book1.getTitle() + "' by " + book1.getAuthor() + " is returned.");
        } catch (BookAlreadyBorrowedException e) {
            System.out.println(e.getMessage());
        } catch (BookNotBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }
}
