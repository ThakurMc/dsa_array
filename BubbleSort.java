import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int []arr){
        for (int i=0;i<arr.length;i++){
            boolean swapped=false;

            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={30,2,4,9,6,0,0};
        bubbleSort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));

    }

}
