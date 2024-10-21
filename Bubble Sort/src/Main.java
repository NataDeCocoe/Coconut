import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bubbleSort bs = new bubbleSort();

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();

        }
        System.out.println();
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bs.bubbleSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}