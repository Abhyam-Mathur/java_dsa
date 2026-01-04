// sum of no in arr whose div is equal to 4
import java.util.Scanner;
public class div4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i]= in.nextInt();
        }
        int result=sumFourDivisors(arr);
        System.out.println(result);
    }
    static int sumFourDivisors(int[] nums){
        int temp=0;
        for (int i=0;i<nums.length;i++){
            int count=0;int sum=0;
            for(int j=1;j<=nums[i];j++){
                if(nums[i]%j==0){
                    count++;
                    sum=sum+j;
                }
            }
            if(count==4){
                temp=temp+sum;
            }
        }
        return temp;
    }
}
