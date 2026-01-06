import java.util.Scanner;
public class flonumarr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements in the array:");
        for (int i = 0; i <size ; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("enter a no to find floor of its: ");
        int x= in.nextInt();
        int result=floor(arr,x);
        System.out.println("floor of the no is: "+result);
    }
    static int floor(int[] arr, int x){
        int start=0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            mid=start+(end-start)/2;
            if (x > arr[mid]) {
                start=mid+1;
            } else if (x<arr[mid]) {
                end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
