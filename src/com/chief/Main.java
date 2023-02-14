package com.chief;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            FileReader reader=new FileReader("C:\\Users\\Baby Beast\\Desktop\\Secret message.txt");//absolute path
           int data= reader.read();
           while (data !=-1){

               System.out.print((char) data);
               data= reader.read(); // reads the next character
           }
reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
