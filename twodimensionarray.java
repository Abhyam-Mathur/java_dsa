import java.util.Scanner;
public class twodimensionarray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two dimension of your 2d array");
        int row= in.nextInt();
        int column = in.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter the elements of your 2d array");
        for(int i = 0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]= in.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
