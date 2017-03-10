import java.util.Arrays;
import java.util.Random;
import java.io.PrintStream;

/** Program showing some uses of arrays */
public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] data = new int[10];
        Random rand = new Random(); // A pseudo-random number generator
        rand.setSeed(System.currentTimeMillis());

        // Fill the data array with pesudo-random numbers from 0 to 99 inclusive
        for (int i = 0; i < data.length; i++)
            {
                data[i] = rand.nextInt(100); // The next pseudo-random integer
            }

        int[] original = Arrays.copyOf(data, data.length); // Make a copy of the
                                                           // data array

        PrintStream printer = System.out;
        printer.println("arrays equal before sort: " + Arrays.equals(data, original));

        Arrays.sort(data);      // Sort the data array

        System.out.println("arrays equal after sort: " + Arrays.equals(data, original));

        // Print the arrays:
        printer.println("original = " + Arrays.toString(original));
        printer.println("sorted data = " + Arrays.toString(data));
    }
}
