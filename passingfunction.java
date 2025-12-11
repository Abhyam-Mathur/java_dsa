import java.util.Scanner;

public class passingfunction {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size= in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the no in the array");
        for(int i=0;i<size;i++){
            arr[i]= in.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
