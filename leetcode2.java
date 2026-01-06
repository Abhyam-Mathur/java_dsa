/*744. Find Smallest Letter Greater Than Target
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 */
import java.util.Scanner;
public class leetcode2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size= in.nextInt();
        char[] arr=new char[size];
        System.out.println("enter the characters in the array:");
        for (int i = 0; i <size ; i++) {
            arr[i]=in.next().charAt(0);
        }
        System.out.println("enter a character:");
        char c=in.next().charAt(0);
        char result=gchar(arr,c);
        System.out.println(result);
    }
    static char gchar(char[] arr, char c){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            mid=start+(end-start)/2;
            if(c>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return arr[start%arr.length];
    }
}
