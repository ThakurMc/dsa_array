public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={1,3,4,5,6,7};
        int n=arr.length;
        int sum_natural_num=(n+1)*(n+2)/2;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        int missing_num=sum_natural_num-sum;
        System.out.println("Missing num is:"+missing_num);
    }
}
