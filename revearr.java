import java.util.Arrays;
import java.util.Scanner;
public class revearr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=in.nextInt();
        int[] arr= new int[size];
        System.out.println("enter the elements in array:");
        for (int i = 0; i <size ; i++) {
            arr[i]=in.nextInt();
        }
        int start=0;int temp=0;
        int end=size-1;
        while(start<end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
        System.out.println("Reversed array:");
        System.out.println(Arrays.toString(arr));
    }
}