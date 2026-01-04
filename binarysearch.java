import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,5,7,8,9,10,25};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no to be searched");
        int x=in.nextInt();
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end) {
            mid=start+(end-start)/2;
            if(x>arr[mid]){
                start=mid+1;
            } else if (x<arr[mid]) {
                end=mid-1;
            } else  {
                System.out.println("found at "+mid);
                break;
            }
        }
    }
}
