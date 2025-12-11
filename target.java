import java.util.Scanner;
public class target {
    public static void main(String[] args){
        int sum;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the target you want to find");
        int target= in.nextInt();
      System.out.println("Enter the length of the array");
      int size= in.nextInt();
      int[] arr= new int[size];
      System.out.println("Enter the elements in the array");
      for(int i=0;i<size;i++){
          arr[i]= in.nextInt();
      }
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            sum=arr[i]+arr[j];

        if(sum==target) {
            System.out.println("targets  " + arr[i] + "+" + arr[j]);
        }

        }
        }
    }
    }
