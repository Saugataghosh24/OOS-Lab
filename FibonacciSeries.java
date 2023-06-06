import java.util.Scanner;                                               //import Scanner class

class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);                       //create 'scanner' object of Scanner class
        System.out.println("Enter the number of terms to print: ");
        int n = scanner.nextInt();                                      //nextInt() is a function to take integer input from user,  and store it in n     
                                                                        
        int firstTerm = 0, secondTerm = 1;
        int sum = 0;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            sum += firstTerm;
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("\nSum of Fibonacci Series up to " + n + " terms: " + sum);
    }
}
