package file_handling;

import java.io.File;
import java.io.IOException;

/*
defination:
          File handling in Java implies reading from and writing data to a file. The File class from the java.

java.io package:
                Java I/O package, a.k.a. java.io, provides a set of input streams and a set of output streams used to read and write data to files or other input and output sources.

 at the time of the creation of any of the new file we need to throw the exception ..

 */
public class new_file_ {
    public static void main(String[] args)throws IOException {
      File file=new File("new.txt");
      file.createNewFile();
    }
}
