package file_handling;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class delete_file {
    public static void main(String[] args)throws IOException {
        File fil=new File("new.txt");
        if(fil.delete()){
            System.out.println("the file is deleted");

        }
        else{
            System.out.println("the file has already been deleted");
        }
    }
    
}
