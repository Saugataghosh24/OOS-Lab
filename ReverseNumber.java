import java.util.Scanner;

class ReverseNumber {
    
    public static int reverse(int num) {
        if (num < 10) {
            return num;
        } else {
            int lastDigit = num % 10;
            int remainingDigits = num / 10;
            return lastDigit * (int)Math.pow(10, String.valueOf(remainingDigits).length()) + reverse(remainingDigits);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        System.out.println("Original number: " + num);
        int reversed = reverse(num);
        System.out.println("Reversed number: " + reversed);
    }
}

