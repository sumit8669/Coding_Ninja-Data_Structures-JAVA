package L4_reursion_2;

public class Quick_Sort_Code {
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {	int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void main(String[] args) {
       int [] arr = {2,3,5,2,4,5,42,45,1,3,35,65,24};
       quickSort(arr);
       for(int val : arr){
           System.out.println(val+" ");
           }
    }
}
