import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class FileTransferer
{
    public static void main(String[] args) throws Exception
    {
        // Create a new linked list to hold the words in the file
        LinkedList<String> filewords = new LinkedList<String>();

        // Scanner to read the words in the file
        Scanner sc = new Scanner(new File("WisdomForRoad.txt"));

        // Put the words into the linked list
        while(sc.hasNext())
            {
                String s = sc.next();

                // If the current word ends in punctuation
                if (s.endsWith(".") || s.endsWith(",") || s.endsWith(";"))
                    {
                        int len = s.length();
                        s = s.substring(0, len - 1);
                    }
                filewords.add(s.toLowerCase());
            }

        // Print the linked list (just to verify the code works)
        System.out.println(filewords.toString());
    }
}
