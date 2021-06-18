package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class write_file {
    /*
    to write inside the file we use FileWriter method 
    after written inside the file we need to close the file
    */
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("new.txt");
        fw.write("this is the data written in the file");
        fw.close();
    }
    
}
