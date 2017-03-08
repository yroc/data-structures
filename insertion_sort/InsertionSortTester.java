public class InsertionSortTester
{
    public static void main(String[] args)
    {
        char[] a = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
        System.out.println(java.util.Arrays.toString(a));
        InsertionSort.insertionSort(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}
