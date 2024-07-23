public class SprialMatrix {

    public static void spiralmatrix(int a[][]){
        int strow=0;
        int endrow=a.length-1;
        int stcol=0;
        int endcol=a[0].length-1;
        while (strow<=endrow && stcol<=endcol) {
            //top
            for (int i = strow; i <= endcol; i++) {
                System.out.print(a[strow][i]+" ");
            }

            //right
            for (int i = strow+1; i <=endrow; i++) {
                System.out.print(a[i][endcol]+" ");
            }

            //bottom
            for (int i = endcol-1; i>=strow; i--) {
                if (strow==endrow) {
                    break;
                }
                System.out.print(a[endrow][i]+" ");
            }

            //left

            for (int i = endrow-1; i>=strow+1;i--) {
                if (stcol==endcol) {
                    break;
                }
                System.out.print(a[i][stcol]+" ");
            }
            stcol++;
            strow++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {

        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralmatrix(arr);
        
    }
}