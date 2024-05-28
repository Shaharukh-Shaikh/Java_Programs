// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class Two_Sum {

    public static void main(String[] args) {
        int []arr = {2,7,11,15};
        int a[]=new int[2];
        int t = 9;
        for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				if(sum==t)
				{
                     a[0]=i;
                     a[1]=j;
				}
			}
		}
        System.out.println(a[0]+" "+a[1]);
    }
}