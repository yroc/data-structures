public class InsertionSort
{
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
