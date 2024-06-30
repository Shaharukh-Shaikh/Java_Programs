public class ContainerWithMostWater {
    public static void main(String[] args) {
        int h[]={1,8,6,2,5,4,8,3,7};
        int max=0;
        int left=0;
        int right=h.length-1;
        while(left<=right){
            int area=0;
            int lenght=Math.abs(right-left);
            int breadth=Math.min(h[left],h[right]);
            area=lenght*breadth;
            max=Math.max(area,max);
            if(h[left]<=h[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(max);
    }
}
