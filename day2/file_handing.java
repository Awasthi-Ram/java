import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handing {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // code to create a new file
        File myFile = new File("file/file_handing.txt");
        myFile.createNewFile();

        // code to write to a file by using filewriter class
        FileWriter fileWriter = new FileWriter("file/file_handing.txt");
        fileWriter.write("these is the frist statement that i have write in my frist file \n ok change the line");
        fileWriter.close();

        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            /*
             * String Line = sc.nextLine();
             * System.out.println(Line);
             */
            // we can allso do it like these
            System.out.println(sc.nextLine());
        }
        sc.close();

        if (myFile.delete()) {
            System.out.println("i have deleted a file "
                    + myFile.getName());
        }
        myFile.toURI();

    }
}
