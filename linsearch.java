import java.util.Scanner;
public class linsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<size;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("enter the element you want to search? ");
        int n= in.nextInt();
        search(arr,n);
    }
    static void search(int[] a, int n){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==n){
                System.out.println("element found at: "+i);
            }
        }
    }
}
