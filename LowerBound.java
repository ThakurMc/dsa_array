import java.util.*;
public class LowerBound {
    public static int findFirstOccureance(int []arr,int x){
        int low=0,high=arr.length-1,result=-1;
        while (low<=high){
            int mid=low+(high-low)/2;

            if (arr[mid]==x){
                result=mid;
                high=mid-1;

            } else if (arr[mid]<x) {
                low=mid+1;

            }
            else
                high=mid-1;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int m=sc.nextInt();
        int [] arr=new int[m];
        System.out.println("Enter the  elements in an array: ");
        for (int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int x=sc.nextInt();
        int result=findFirstOccureance(arr,x);
        if (result==-1){
            System.out.println("Target element is not found in the array ");
        }
        else
            System.out.println("Target element is  found in the array at index "+result);


    }
}
