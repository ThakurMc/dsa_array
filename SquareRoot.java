import java.util.*;
public class SquareRoot {
    public static int squareRoot(int x){
        int low=0,high=x,result=0;
        while (low<=high){
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if (val==x)
                return mid;
            else if (val<x) {
                result=mid;
                low=mid+1;

            }
            else
                high=mid-1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x=sc.nextInt();
        int result=squareRoot(x);
        System.out.println("the square root of "+x+" is:"+result);
    }
}
