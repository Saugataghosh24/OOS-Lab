abstract class Publication {
    private int noOfPages;
    private double price;
    private String publisherName;

    public Publication(int noOfPages, double price, String publisherName) {
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisherName = publisherName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publication {
    private String title;
    private String author;

    public Book(String title, String author, int noOfPages, double price, String publisherName) {
        super(noOfPages, price, publisherName);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Journal extends Publication {
    private String journalName;
    private int issueNo;

    public Journal(String journalName, int issueNo, int noOfPages, double price, String publisherName) {
        super(noOfPages, price, publisherName);
        this.journalName = journalName;
        this.issueNo = issueNo;
    }

    public String getJournalName() {
        return journalName;
    }

    public int getIssueNo() {
        return issueNo;
    }
}

class Library {
    private Publication[] publications;

    public Library() {
        publications = new Publication[10]; 
    }

    public void addPublication(Publication publication) {
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null) {
                publications[i] = publication;
                break;
            }
        }
    }


    public void printPublications() {
        System.out.println("Details of all publications in the library:");
        for (Publication publication : publications) {
            if (publication != null) {
                
                if (publication instanceof Book) {
                    Book book = (Book) publication;
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                } else if (publication instanceof Journal) {
                    Journal journal = (Journal) publication;
                    System.out.println("Journal Name: " + journal.getJournalName());
                    System.out.println("Issue No.: " + journal.getIssueNo());
                }
                System.out.println("No. of Pages: " + publication.getNoOfPages());
                System.out.println("Price: " + publication.getPrice());
                System.out.println("Publisher Name: " + publication.getPublisherName());
                System.out.println("---------------------");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        Book book1 = new Book("The Great Gatsby", "F.Scott Fitzgerald", 140, 120, "Scribner");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 172, 230, "Harper");
        Book book3 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 536, 280, "Fingerprint");
    
    Journal journal1 = new Journal("Science Today", 120, 50, 50, "Science Publications");
    Journal journal2 = new Journal("Nature", 450, 100, 60, "Nature Publishing Group");

    Library library = new Library();

    library.addPublication(book1);
    library.addPublication(book2);
    library.addPublication(book3);
    library.addPublication(journal1);
    library.addPublication(journal2);

    library.printPublications();
}
}
