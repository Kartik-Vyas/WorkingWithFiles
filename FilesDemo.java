package Resources;

import java.io.File;

public class FilesDemo {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\vyask\\IdeaProjects\\WorkingWithFiles\\src\\Resources\\test.txt");
        if(x.exists())
        {
            System.out.println(x.getName() + "  : exists");
        }
        else
        {
            System.out.println("not exists");
        }
    }
}
