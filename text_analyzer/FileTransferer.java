import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class FileTransferer
{
    public static void main(String[] args) throws Exception
    {
        String[] filewords;     // String array to hold the words in the given
                                // file
        int numWords = 0;       // The number of words in the file

        // Scanner to read the words in the file (for counting purposes)
        Scanner sc = new Scanner(new File("WisdomForRoad.txt"));

        // Count the number of words in the file
        while(sc.hasNext())
            {
                sc.next();
                numWords++;
            }

        // Instantiate the array to hold all the words
        filewords = new String[numWords];

        // New Scanner to reread the words in the file (to put them in the
        // array)
        sc = new Scanner(new File("WisdomForRoad.txt"));
        
        // Put the words into the array
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

        // Print the array (just to verify the code works)
        System.out.println(Arrays.toString(filewords));

        // Sort the array
        Arrays.sort(filewords);

        // Print the sorted array (just to verify the code works)
        System.out.println("\n" + Arrays.toString(filewords));
    }
}
