import java.util.Scanner;
class Word {

    public static void main(String args[]){
    String sentence;
    Scanner sc= new Scanner(System.in);
    sentence= sc.nextLine();

    int len=0;
    int large=0;

    for(int i=0; i<sentence.length(); i++){
        while(sentence.charAt(i)!=" "){
            len++;
        }
        if(large<len){
            large= len;
            len=0;
        }
        else{
            len=0;
        }
    }
    
    System.out.println("Longest word length is= "+large);
}
}