public class InsertionSort
{
    public static void insertionSort(char[] data)
    {
        int n = data.length;
        for (int k = 1; k < n; k++) // k is the index of current element,
                                    // beginning with the first element (not the
                                    // zeroth)
            {
                char cur = data[k]; // cur is the current element
                int j = k;          // j is the eventual position of the current
                                    // character, initialized to the current
                                    // character's current position
                while (j > 0 && data[j - 1] > cur)
                    {
                        data[j] = data[j - 1];
                        j--;
                    }
                data[j] = cur;
            }
    }
}
