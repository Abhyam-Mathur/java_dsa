import java.util.Arrays;
import java.util.Scanner;
public class mulsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the diamentions of the array: ");
        int row= in.nextInt();
        int col= in.nextInt();
        int [][] arr= new int[row][col];
        System.out.println("enter the no in array: ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                arr[i][j]= in.nextInt();
            }
        }
      //  for(int[] a : arr) {
      //      System.out.println(Arrays.toString((a)));
      //  }
        System.out.println("Enter the element to search ");
        int x= in.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==x){
                    System.out.println("yes present in array: at position: "+i +" "+ j);
                }
            }

        }
    }
}
