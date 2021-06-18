package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) throws IOException{
        File f=new File("new.txt");
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){

            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        
    }
    
}
