import java.util.Arrays;
import java.util.Scanner;
public class swaparr {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= in.nextInt();
        int[] arr= new int[size];
        System.out.println("enter the elements in array: ");
        for (int i = 0; i <size ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the position to be swapped: ");
        int i= in.nextInt();
        int j= in.nextInt();
        swap(arr, i, j);
    }
    static void swap(int[] arr, int pos1, int pos2){
        int temp;
        temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
