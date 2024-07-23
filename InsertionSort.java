public class InsertionSort {

    public static void insertionSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int x=a[i];
            int prev=i-1;
            while (a[prev]>x && prev>-1) {
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=x;
        }
    }
    public static void display(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        insertionSort(arr);
        display(arr);
    }
}
