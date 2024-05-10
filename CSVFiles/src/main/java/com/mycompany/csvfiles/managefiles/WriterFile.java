
package com.mycompany.csvfiles.managefiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriterFile {
     private File file;
     private FileWriter fileWriter;
     private PrintWriter printWriter;

    public WriterFile(File file) throws IOException {
        this.file = file;
        this.fileWriter = new FileWriter(file);
        this.printWriter = new PrintWriter(fileWriter);
    }
    
    public PrintWriter (writerFile) {
    
    }
    pw = new PrintWriter(writer);
       
       for (int i = 0; i < 10; i++) {
            pw.print("Linea " + i);
        }
        writerFile.close();
}
