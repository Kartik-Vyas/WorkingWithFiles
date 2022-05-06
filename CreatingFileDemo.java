package Resources;

import java.util.Formatter;

public class CreatingFileDemo {
    public static void main(String[] args) {
        try
        {
            Formatter f = new Formatter("C:\\Users\\vyask\\IdeaProjects\\WorkingWithFiles\\src\\Resources\\new_test.txt");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
