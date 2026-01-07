import java.util.Scanner;

//Find position of an element in a sorted array of infinite numbers
// conceptually correct code but can't be applied
public class infinitearray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=in.nextInt();
        int [] arr=new int[size];
        System.out.println("enter the elements in the array:");
        for (int i = 0; i <size ; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("enter the element to be searched:");
        int x=in.nextInt();
        System.out.println(ans(arr,x));
    }
    static int ans(int[] arr,int x){
        int start=0;
        int end=1;
        while(x>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return bs(arr,x,start,end);
    }
    static int bs(int[] arr,int x,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(x>arr[mid]){
                start=mid+1;
            } else if (x<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
