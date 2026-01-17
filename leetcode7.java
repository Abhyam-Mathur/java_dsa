import java.util.Arrays;

//1480. Running Sum of 1d Array
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Hint
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class leetcode7 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int [] temp=buildarr(nums);
        System.out.println(Arrays.toString(temp));
    }
    static int[] buildarr(int[] nums){
        int[] arr=new int[nums.length];
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum=sum+nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
