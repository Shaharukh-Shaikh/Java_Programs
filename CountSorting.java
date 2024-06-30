public class CountSorting {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,2,5};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println(max);
        int count[]=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            count[element]++;
        }
        for (int i = 0; i < count.length; i++) {
            int fre=count[i];
            for (int j = 1; j <= fre; j++) {
                System.out.print(i+" ");
            }
        }

    }
}
