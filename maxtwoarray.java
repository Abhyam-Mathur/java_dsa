import java.util.Scanner;
public class maxtwoarray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of two dimention array ");
        int row=in.nextInt();
        int col= in.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("enter the no in array:");
        for (int i = 0; i <row ; i++) {
            for (int j=0;j<col;j++){
                arr[i][j]= in.nextInt();
            }
        }
        int temp=arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>temp){
                    temp=arr[i][j];
                }
            }
        }
        System.out.println("max is "+temp);
    }
}
