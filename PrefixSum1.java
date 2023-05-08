import java.util.*;
public class PrefixSum1 {
    public static int findSum(int [][]arr,int r1,int c1,int r2,int c2){
        int sum=0;
        for (int i=r1;i<=r2;i++){
            for (int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows -");
        int m=sc.nextInt();
        System.out.println("Enter no. of columns-");
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Enter the matrix elements:");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r1,c1,r2,c2;
        System.out.println("Enter the r1 coordinates:");
        r1=sc.nextInt();
        System.out.println("Enter the c1 coordinates:");
        c1=sc.nextInt();
        System.out.println("Enter the r2 coordinates:");
        r2=sc.nextInt();
        System.out.println("Enter the c2 coordinates:");
        c2=sc.nextInt();
        int result=findSum(arr,r1,c1,r2,c2);
        System.out.println("Sum of the matrix:"+result);
    }
}
