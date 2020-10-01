package lesson4;

import java.io.FileInputStream;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream("C:\\Users\\Administrator.000\\IdeaProjects\\JavaExcersises\\src\\lesson4\\data.csv");
            System.out.print(fileIn.read());

        }
        finally {
            if (fileIn != null){
            fileIn.close();
            }
        }
    }
}