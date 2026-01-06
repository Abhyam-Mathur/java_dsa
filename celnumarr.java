import java.util.Arrays;
import java.util.Scanner;
public class celnumarr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size= in.nextInt();
        int [] arr=new int[size];
        display(arr,size);
        System.out.println("enter the no to find the ceiling: ");
        int x=in.nextInt();
        int result=ceiling(arr,x);
        System.out.println("celing no is: "+result);
    }
    static void display(int[] arr,int size){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the sorted elements in the array: ");
        for (int i = 0; i <size ; i++) {
            arr[i]=in.nextInt();
        }
    }
    static int ceiling(int[] arr,int x){
        if(x>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(x>arr[mid]){
                start=mid+1;
            } else if (x<arr[mid]) {
                end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
