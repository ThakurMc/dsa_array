import java.util.*;
public class Rotation2dArray {
    public static void rotatedMatrix(int [][] arr){
        int m=arr.length;
        int n=arr[0].length;
        for (int i=0;i<m;i++){
            for (int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i=0;i<m;i++){
            int x=0;
            int y=m-1;
            while (x<y){
                int temp=arr[i][x];
                arr[i][x]=arr[i][y];
                arr[i][y]=temp;
                x++;
                y--;

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows-");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns-");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotatedMatrix(arr);
        for (var mat : arr) {
            System.out.println(Arrays.toString(mat));
//        System.out.println(arr);
        }
    }
}
