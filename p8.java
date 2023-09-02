class Book {
    String title;
    String authors[];
    int numPages;
    double price;
    String publisher;

    Book(String title, String authors[], int numPages, double price, String publisher) {
        this.title = title;
        this.authors = authors;
        this.numPages = numPages;
        this.price = price;
        this.publisher = publisher;
    }
}


class Library {
    Book books[];
    int numBooks;

    Library(int maxNumBooks) {
        books = new Book[maxNumBooks];
        numBooks = 0;
    }

    void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Cannot add book. Library is full.");
        }
    }

    void removeBook(Book book) {
        int index = -1;
        for (int i = 0; i < numBooks; i++) {
            if (books[i] == book) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Cannot remove book. Library is empty.");
        } else {
            for (int i = index; i < numBooks - 1; i++) {
                books[i] = books[i + 1];
            }
            numBooks--;
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < numBooks; i++) {
            totalPrice += books[i].price;
        }
        return totalPrice;
    }


    public static void main(String args[]) {
        Library library = new Library(5);
        Book book1 = new Book("The Alchemist", new String[]{"Paulo Coelho"}, 172, 230, "Harper");
        Book book2 = new Book("To Kill a Mockingbird", new String[]{"Harper Lee"}, 320, 200, "RHUK");
        Book book3 = new Book("Ikigai", new String[]{"Garcia Hector","Francesc Miralles"}, 200, 260, "RHUK");
        Book book4 = new Book("Sherlock Holmes", new String[]{"Arthur Conan Doyle"}, 536, 280, "Fingerprint");
        Book book5 = new Book("Harry Potter and  the Cursed Child", new String[]{"J.K. Rowling"}, 352, 270, "Little, Brown");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println("Total price of all books in the library: Rs " + library.getTotalPrice());
       
    }
}

