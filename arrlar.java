import java.util.Scanner;
public class arrlar {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements  in array");
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        max(arr);
    }
    static void max(int [] a){
        int temp=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>temp){
                temp=a[i];
            }
        }
        System.out.println(temp);
    }
}
