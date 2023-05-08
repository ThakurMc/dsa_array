import javax.swing.*;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[]arr){
        for (int i=1;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    j--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={90,0,21,5,43,1,0};
        insertionSort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
