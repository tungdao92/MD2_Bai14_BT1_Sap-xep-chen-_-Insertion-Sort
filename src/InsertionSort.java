import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int k;
            for ( k = i -1; k >= 0 && arr[k] > currentElement ; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = currentElement;
        }
    }
}
