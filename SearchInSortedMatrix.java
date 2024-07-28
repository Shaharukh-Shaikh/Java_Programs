public class SearchInSortedMatrix {

    public static void searchInSortedMatrix(int arr[][],int key){
        int row=0,col=arr[0].length-1;
        while (row<arr[0].length && col>=0) {
            if (arr[row][col]==key) {
                System.out.println("key is found at ["+row+","+col+"]");
                return;
            }else if (key>arr[row][col]) {
                row++;
            }else{
                col--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        int key=15;
        searchInSortedMatrix(arr,key);
    }
}
