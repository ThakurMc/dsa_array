import java.util.*;
public class BinarySearch {
    public static int findTarget(int []arr,int x){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==x)
                return mid;
            else if (arr[mid]<x) {
                low=mid+1;

            }
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,6,8,9};
        int x=6;
        int result=findTarget(arr,x);
        System.out.println(result);
    }
}
//    public static int binarySearch(int arr[],int x){
//        int low=0,high=arr.length-1;
//        while (low<=high){
//            int mid = low+ (high-low)/2;
//            if (arr[mid]==x){
//                return mid;
//            } else if (arr[mid]<x) {
//                low=mid+1;
//
//            }else {
//                high=mid-1;
//            }
//
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter no. of array elements ");
//        int m= sc.nextInt();
//        System.out.println("Enter array elements ");
//        int []arr=new int[m];
//        for (int i=0;i<m;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter target element ");
//        int x=sc.nextInt();
//        int result=binarySearch(arr,x);
//
//        if (result==-1){
//            System.out.println("target element not found");
//
//        }
//        else
//            System.out.println("target element found at the index no."+result);
//
//
//    }
//}
