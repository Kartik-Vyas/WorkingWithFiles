package Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesDemo {
    public static void main(String[] args) {
        try
        {
            File f = new File("C:\\Users\\vyask\\IdeaProjects\\WorkingWithFiles\\src\\Resources\\test.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext())
            {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

    }
}
