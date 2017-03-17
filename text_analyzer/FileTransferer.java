import java.util.Scanner;
import java.io.File;

public class FileTransferer
{
    public static void main(String[] args) throws Exception
    {
        // Create a new String array to hold the words in the file
        String[] filewords;
        int numWords = 0;

        // Scanner to read the words in the file
        Scanner sc = new Scanner(new File("WisdomForRoad.txt"));
        /*
        // Count the number of words in the file
        while(sc.hasNext())
            {
                numWords++;
            }
        System.out.println(numWords);


        // Instantiate the array
        filewords = new String[numWords];
        
        // Put the words into the linked list
        for (int i = 0; i < numWords; i++)
            {
                String s = sc.next();

                // If the current word ends in punctuation
                if (s.endsWith(".") || s.endsWith(",") || s.endsWith(";"))
                    {
                        int len = s.length();
                        s = s.substring(0, len - 1);
                    }
                filewords[i] = s.toLowerCase();
            }

        // Print the linked list (just to verify the code works)
        System.out.println(filewords.toString());*/
    }
}
