import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class filehandling {
    public static void main(String[] args) {
        File f1 = new File("source.txt");
        try {
            if (f1.createNewFile()) {
                System.out.println(f1.getName());
                System.out.println(f1.getPath());
                System.out.println(f1.getAbsolutePath());
                System.out.println("size= " + f1.length());
                System.out.println(f1.exists());
                System.out.println(f1.canRead());
                System.out.println(f1.canWrite());
                System.out.println(f1.isDirectory());
                System.out.println(f1.getParent());
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found " + e);
        } catch (IOException e) {
            System.out.println("error occured " + e);
        }

        try {
            FileWriter f2 = new FileWriter(f1);
            Scanner input = new Scanner(System.in);
            String r = input.nextLine();
            f2.write(r);
            f2.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + e);
        } catch (IOException e) {
            System.out.println("error occured " + e);
        }

        try {
            FileWriter f3 = new FileWriter("destination.txt");
            Scanner obj = new Scanner(f1);
            while (obj.hasNextLine()) {
                String s = obj.nextLine();
                f3.write(s);
            }
            obj.close();
            f3.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + e);
        } catch (IOException e) {
            System.out.println("error occured " + e);
        }

        try {
            FileReader f4 = new FileReader(f1);
            FileWriter f5 = new FileWriter("destinationc.txt");
            int c;
            while (((c = f4.read()) != -1)) {
                f5.append((char) c);
            }
            f4.close();
            f5.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + e);
        } catch (IOException e) {
            System.out.println("error occured " + e);
        }

    }
}
