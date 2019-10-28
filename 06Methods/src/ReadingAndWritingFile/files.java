package ReadingAndWritingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {
    public static void main(String[] arg) throws IOException {
        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst01\n");
            fileWriter.write("Tekst02\n");
            fileWriter.write("Tekst03\n");
            fileWriter.write("Tekst04\n");
            fileWriter.write("Tekst05\n");
        } catch (IOException ex){
            System.out.println("Problem z dostęprem do pliku.");
        } finally {//finally oznacza, że instrukcja poniżej zostanie wykonana bezwzględu na to czy instrukcje w bloku try zostaną wykonane
            if (fileWriter == null) {
                System.out.println("Problem.");
                fileWriter.close();
            }else {
                fileWriter.close();//zamyka strumień przesyłania danyych do pliku
            }
        }

        BufferedReader bf = null;

        try {
            bf = new BufferedReader(new FileReader(fileName));
            String line = null;
            do {
                line = bf.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            }while (line != null);

        }catch (IOException ex){
            System.out.println("Problem z dostępem do pliku.");
        }finally {
            if (bf == null) {
                System.out.println("Problem.");
                bf.close();
            } else bf.close();
        }
    }
}
