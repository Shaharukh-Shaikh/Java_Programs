public class RemoveDuplicatedFromSortedArray {
    public static int removeDuplicates(int nums[]){
        int count=0;
      for(int i=0;i<nums.length;i++){
        if(i<nums.length-1 && nums[i]==nums[i+1]){
            continue;
        }else{
            nums[count]=nums[i];
            count++;
        }
      }
      return count;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3,4,4,5};
        int k=removeDuplicates(arr);
        System.out.println("count of unique elements is : "+k);
        
    }
}
