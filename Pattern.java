import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

