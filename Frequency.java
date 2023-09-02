import java.util.Scanner;

class Frequency {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int N= sc.nextInt();

    int arr[]= new int[N];
    System.out.println("Enter the elements");

    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    sc.close();

    Frequnecy f= new Frequency();
    f. freq(arr);
}
}