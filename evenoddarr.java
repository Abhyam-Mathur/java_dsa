import java.util.Scanner;
public class evenoddarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the no in array:");
        for (int i = 0; i <size ; i++) {
            arr[i]= in.nextInt();
        }
        int count=0;int x=0;
        for (int i = 0; i <size; i++) {
            count=(int)(Math.log10(arr[i])+1);
            if(count%2==0){
                x++;
            }
        }
        System.out.println(x);
    }
}
