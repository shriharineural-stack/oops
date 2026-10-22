import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Book {
    private int bookId;
    private String bookName;
    private String author;
    private boolean issued;
    private String borrowerName;
    private LocalDate issueDate;
    private LocalDate dueDate;

    public Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isIssued() {
        return issued;
    }

    public void displayBook() {
        System.out.println("Book ID     : " + bookId);
        System.out.println("Book Name   : " + bookName);
        System.out.println("Author      : " + author);
        System.out.println("Status      : " +
                (issued ? "Issued" : "Available"));

        if (issued) {
            System.out.println("Borrower    : " + borrowerName);
            System.out.println("Issue Date  : " + issueDate);
            System.out.println("Due Date    : " + dueDate);
        }
        System.out.println("--------------------------------");
    }

    public void issueBook(String name, LocalDate date) {
        if (issued) {
            System.out.println("Book is already issued!");
            return;
        }

        borrowerName = name;
        issueDate = date;
        dueDate = date.plusDays(14);
        issued = true;

        System.out.println("Book issued successfully!");
        System.out.println("Borrower    : " + borrowerName);
        System.out.println("Issue Date  : " + issueDate);
        System.out.println("Due Date    : " + dueDate);
    }

    public void returnBook(LocalDate returnDate) {
        if (!issued) {
            System.out.println("Book is not issued!");
            return;
        }

        if (returnDate.isBefore(issueDate)) {
            System.out.println("Return date cannot be before issue date!");
            return;
        }

        long lateDays = Math.max(
                0, ChronoUnit.DAYS.between(dueDate, returnDate));

        double fine = lateDays * 5.0;

        System.out.println("\n----- RETURN DETAILS -----");
        System.out.println("Book Name   : " + bookName);
        System.out.println("Borrower    : " + borrowerName);
        System.out.println("Return Date : " + returnDate);
        System.out.println("Late Days   : " + lateDays);
        System.out.println("Fine Amount : Rs. " + fine);

        issued = false;
        borrowerName = null;
        issueDate = null;
        dueDate = null;

        System.out.println("Book returned successfully!");
    }
}

public class LibraryManagementSystem {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Book findBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                return b;
            }
        }
        return null;
    }

    static void searchBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book b = findBook(id);

        if (b != null) {
            b.displayBook();
        } else {
            System.out.println("Book not found!");
        }
    }

    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.print("Enter Borrower Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Issue Date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        b.issueBook(name, date);
    }

    static void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Book b = findBook(id);

        if (b == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.print("Enter Return Date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        b.returnBook(date);
    }

    static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    public static void main(String[] args) {

        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Python Basics", "Guido van Rossum"));
        books.add(new Book(103, "Data Structures", "Seymour Lipschutz"));
        books.add(new Book(104, "Database Systems", "Raghu Ramakrishnan"));
        books.add(new Book(105, "Operating Systems", "Galvin"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display All Books");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;

                case 2:
                    searchBook();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    returnBook();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
