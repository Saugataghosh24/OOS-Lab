import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

class FileCopy {

    public static void main(String args[]){
    int nextByte;
    FileInputStream fis= null;
    FileOutputStream fos= null;
    
    try{
        fis= new FileInputStream("C:\\BE IT\\4th Sem\\OOS Lab\\Programs\\Source.txt");
        fos= new FileOutputStream("C:\\BE IT\\4th Sem\\OOS Lab\\Programs\\Dest.txt");

        while((nextByte=fis.read())!=-1){
            fos.write((char)nextByte);

        }
    }
    catch(IOException e){

    }
}
}