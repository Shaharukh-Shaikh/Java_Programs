public class SubArray {
    public static void subarray(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
                int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int sum=0;
                for (int k = start; k <=end; k++) {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.println(" "+"Sum "+sum);
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }

    
}
