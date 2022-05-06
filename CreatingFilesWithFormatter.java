package Resources;

import java.util.Formatter;

public class CreatingFilesWithFormatter {
    public static void main(String[] args) {
        try
        {
            Formatter f = new Formatter("C:\\Users\\vyask\\IdeaProjects\\WorkingWithFiles\\src\\Resources\\new_test.txt");
            f.format("%s %s %s","1","John","Smith \r\n");
            f.format("%s %s %s","2","Amy","Watson");
            f.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
