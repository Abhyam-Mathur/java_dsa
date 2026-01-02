import java.util.Scanner;
import java.math.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a= in.nextInt();
        int temp1=a;
        int temp=a; double sum=0;
        int count=0;
        while (temp1>0){
            int x=temp1%10;
            temp1=temp1/10;
            count++;
        }
        while(temp>0){
            int x=temp%10;
            temp=temp/10;
            sum=sum+ Math.pow(x,count) ;
        }
        if(a==sum){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("not an armstrong no");
        }
    }
}
