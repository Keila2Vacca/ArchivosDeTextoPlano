
package com.mycompany.csvfiles;

import com.mycompany.csvfiles.managefiles.ReadFile;
import com.mycompany.csvfiles.managefiles.WriterFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class CSVFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       File file = new File("./DATA.csv");
       
       ReadFile readFile = new ReadFile(file);
       
       List<String> data = readFile.loadData();
       
       for (String line : data){
           //System.out.println(Line);
           String[] splited = new String[3];
           splited = line.split(";");
           System.out.println("Hola " + splited[1] + " " + splited[2] + " " + ", tu código es: " + splited[0] );
       }
       
       WriterFile writerFile = new WriterFile(file);
       
    }
}
