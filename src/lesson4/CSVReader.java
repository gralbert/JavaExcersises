package lesson4;

import lesson3.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVReader {
    String path;
    BufferedReader br = null;
    String line = "";
    String csvSeparator = ";";
    ArrayList<String[]> persons = new ArrayList<>();

    public CSVReader(String path) {
        this.path = path;
    }

    public ArrayList<String[]> read() {

        try {

            br = new BufferedReader(new FileReader(this.path));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] person = line.split(csvSeparator, -1);
                persons.add(person);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return persons;
    }

    public void write(ArrayList<String[]> thingsToWrite){
        try (FileWriter writer = new FileWriter(this.path)){
            for (String[] strings : thingsToWrite) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if(i < (strings.length-1))
                        writer.append(this.csvSeparator);
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}