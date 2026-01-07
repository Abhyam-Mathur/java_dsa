/* 34 Find First and Last Position of Element in Sorted Array
iven an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

 */
import java.util.Arrays;
import java.util.Scanner;
public class leetcode3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the no :");
        int x = in.nextInt();
//        int pos1=0; int pos2=0;
//        for (int i = 0; i <size ; i++) {
//            if(x==arr[i]){
//                pos1=i;
//                break;
//            }
//        }
//        for (int i = arr.length-1; i >=0 ; i--) {
//            if(x==arr[i]){
//                pos2=i;
//                break;
//            }
//        }
//        if(pos1==pos2){
//            System.out.println(pos1);
//        }
//        else{
//            System.out.println("postions are: "+ pos1+" "+ pos2);
//        }       time complexity by this is O(n)
        System.out.println(Arrays.toString(position(arr,x)));
    }

    static int[] position(int[] arr, int x) {
        int[] ans = {-1, -1};
        int start=search(arr,x,true);
        int end=search(arr,x,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] arr, int x,boolean findstartindex){
        int ans=-1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x > arr[mid]) {
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                ans= mid;
                if(findstartindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
