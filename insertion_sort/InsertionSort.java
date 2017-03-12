/**
 * A class with a single static method that sorts a character array in
 * increasing order using the well-known insertion sort algorithm.
 */

public class InsertionSort
{
    /**
     * Sorts the given character array in increasing order.
     *
     * @param data The given character array.
     */
    public static void insertionSort(char[] data)
    {
        for (int i = 1; i < data.length; i++)
            {
                int cur = i;
                int pre = i - 1;

                while (cur > 0 && data[cur] < data[pre])
                    {
                        char temp = data[pre];
                        data[pre] = data[cur];
                        data[cur] = temp;
                        cur--;
                        pre--;
                    }
            }
    }
}
