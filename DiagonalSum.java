public class DiagonalSum {

    public static void diagonalSum(int a[][]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            //pd
            sum+=a[i][i];
            //sd
            if (i!=a.length-1-i)
                sum+=a[i][a.length-1-i];

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum(arr);
    }
}
