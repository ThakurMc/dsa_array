import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements ");
        int m = sc.nextInt();
        int arr[] = new int[m];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter target element");
        int x = sc.nextInt();
        int idx=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                idx=i;
                break;
            }
        }
        if (idx==-1){
            System.out.println("target element not found");
        }
        else
            System.out.println("target element found at index no."+idx);
    }

}
