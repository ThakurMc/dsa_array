public class DuplicateNumber {
    public static void main(String[] args) {
        int []arr={2,3,5,4,5,7,7};
        int n= arr.length;
        int idx=-1;
        for (int i=1;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                if (arr[i]==arr[j]){
//                    System.out.println("Duplicate number is: "+ arr[i]);
//                }
//            }
            if (arr[i]==arr[i-1]) {
                idx = i;

                System.out.println("Duplicate number is: " + arr[i]);
                break;
            }
        }
    }
}
