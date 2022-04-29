import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("/home/INTEXSOFT/ekaterina.gorshunova/ITXSUNFLOW-423_files/new.txt");
        System.out.println("Get file name: " + file.getName());
        System.out.println ("Get absolute path: " + file.getAbsolutePath ());
        System.out.println("Get path: " + file.getPath());
        System.out.println ("If file exists: " + file.exists ());
        System.out.println("If file can read: " +file.canRead());
        System.out.println("If file can write: " +file.canWrite());
        System.out.println ("Directory: " + file.isDirectory ());
        System.out.println ("Is it a file: " + file.isFile ());
        System.out.println ("File length: " + file.length ());
        long time = file.lastModified();
        Date d = new Date(time);
        System.out.println ("Last modified time: " + d);
        file.setLastModified(0);

        File f2 = new File("/home/INTEXSOFT/ekaterina.gorshunova/ITXSUNFLOW-423_files/321.txt");
        f2.renameTo(f2);
        System.out.println("Get new name of the file:" +file.getName());


        FileWriter fw = new FileWriter( "file1.txt" );
        fw.write("Some message");
        fw.close();

        FileReader fr = new FileReader( "file2.txt" );
        Scanner scan1 = new Scanner(fr);
        System.out.println("Read file2.txt");
        int i1 = 1;
        while (scan1.hasNextLine()) {
            System.out.println(i1 + ") " + scan1.nextLine());
            i1++;
        }
        fr.close();

    }

}
