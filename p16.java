import java.util.*;
class Book
{
    String author;
    String title;
    String publisher;
    double price;
    int stockposition;
    
    Book(String auth, String ttl, String pub, double pr, int spos)
    {
        author = auth;
        title = ttl;
        publisher = pub;
        price = pr;
        stockposition = spos;
    }
}

class Store
{
    Book b[];
    private int bookcount;
    private int nextindex;
    
    Store(int n)
    {
        bookcount = n;
        b = new Book[n];
        nextindex = 0;
    }
    
    void add(String auth, String ttl, String pub, double pr, int spos)
    {
        if(nextindex == bookcount)
        {
            System.out.println("Shop is full. No space to store any more books");
            return;
        }
        Book bk = new Book(auth, ttl, pub, pr, spos);
        b[nextindex++] = bk;
    }
    
    private void extract(Book bk, int reqd)
    {
        if(bk.stockposition < reqd)
            System.out.println("The required number of copies of the book is unavailable.");
        else
        {
            System.out.println(reqd + " copies of " + bk.title + " are supplied");
            System.out.println("Bill: Rs. " + bk.price*reqd);
            bk.stockposition -= reqd;
        }
    }
    
    void search(String auth, String ttl)
    {
        for(int i=0; i<nextindex; i++)
        {
            if(auth.compareTo(b[i].author) == 0 && ttl.compareTo(b[i].title) == 0)
            {
                System.out.println("Book is available in the shop. How many do you need?");
                Scanner sc = new Scanner(System.in);
                int r = sc.nextInt();
                extract(b[i], r);
                if(b[i].stockposition == 0)
                {
                    for(int j=i; i<nextindex-1; i++)
                        b[j] = b[j+1];
                    nextindex--;
                }
                sc.close();
                return;
            }
        }
        System.out.println("The book you are searching for is currently unavailable");
    }
    
}

class Main 
{
    public static void main(String args[]) 
    {
        Store s = new Store(3);
        s.add("J.K. Rowling", "Harry Potter", "Little", 352, 6);
        s.add("Arthur Conan Doyle", "Sherlock Holmes", "Fingerprint", 536, 8);
        s.add("Paul Coelho", "The Alchemist", "Harper", 172, 3);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the author of the book you are searching");
        String auth1 = sc.nextLine();
        System.out.println("Enter the name of the book you are searching");
        String ttl1 = sc.nextLine();
        s.search(auth1, ttl1);
        
        System.out.println("Enter the author of the book you are searching");
        String auth2 = sc.nextLine();
        System.out.println("Enter the name of the book you are searching");
        String ttl2 = sc.nextLine();
        s.search(auth2, ttl2);
        sc.close();
    }
}