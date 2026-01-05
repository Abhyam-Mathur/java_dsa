import java.util.Scanner;
public class orderagnosticbs {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in array either in ascending or descending order: ");
        for (int i = 0; i < size; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("Enter the element to be searched? ");
        int search=in.nextInt();
        int start=0;
        int end= arr.length-1;
        int mid=start+(end-start)/2;
        if(arr[start]<arr[end]) {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (search > arr[mid]) {
                    start = mid + 1;
                } else if (search < arr[mid]) {
                    end = mid - 1;
                } else {
                    System.out.println("found at: " + mid);
                    break;
                }
            }
        } else if (arr[end]<arr[start]) {
            while(start<=end){
                mid=start+(end-start)/2;
                if (search>arr[mid]){
                    end=mid-1;
                } else if (search<arr[mid]) {
                    start=mid+1;
                }
                else{
                    System.out.println("found at "+mid);
                    break;
                }
            }
    }
    }
}
