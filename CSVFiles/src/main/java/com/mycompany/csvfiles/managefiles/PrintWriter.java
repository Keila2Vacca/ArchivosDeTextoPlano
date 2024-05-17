
package com.mycompany.csvfiles.managefiles;

import java.io.File;
import java.io.FileWriter;


public class PrintWriter {
     private File file;
     private FileWriter fileWriter;
     private PrintWriter printWriter;
     private boolean status;

    public PrintWriter(FileWriter fileWriter, boolean status) {
        this.fileWriter = fileWriter;
        this.status = status;
    }

    public PrintWriter(WriterFile fileWriter, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void println(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
