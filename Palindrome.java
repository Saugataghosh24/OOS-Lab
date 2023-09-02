import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        StringBuffer sen= new StringBuffer();
        StringBuffer rev= new StringBuffer();

        Scanner sc= new Scanner(System.in);
        sen.append(sc.nextLine());
        rev= sen;
        
        System.out.println(sen);
        rev.reverse();
        System.out.println(rev);
        sc.close();

        if(sen.equals(rev)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }   
}
