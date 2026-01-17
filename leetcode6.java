import java.util.Arrays;

//1929. Concatenation of Array
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Hint
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//
//
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
public class leetcode6 {
    public static void main(String[] args) {
        int [] nums={1,2,1};
        int [] temp=buildarr(nums);
        System.out.println(Arrays.toString(temp));
    }
    static int[] buildarr(int [] nums){
        int [] arr=new int[2*nums.length];
        int size=nums.length;
        for (int i = 0; i <nums.length ; i++) {
            arr[i]=nums[i];
        }
        for (int i = 0; i <nums.length ; i++) {
            arr[size]=nums[i];
            size++;
        }
        return arr;
    }
}
