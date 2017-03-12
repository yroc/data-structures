/**
 * A class to test the InsertionSort class.
 */

public class InsertionSortTester
{
    /**
     * Creates a character array and passes it to InsertionSort.insertionSort to
     * see if the array gets successfully sorted.
     *
     */
    public static void main(String[] args)
    {
        char[] a = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
        System.out.println(java.util.Arrays.toString(a));
        InsertionSort.insertionSort(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}
