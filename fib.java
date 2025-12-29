import java.util.Scanner;
public class fib {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a no: ");
        int a = in.nextInt();
        int x=0;
        int y=1;
        int sum=0;
        for (int i = 1; i <a; i++) {
            sum=x+y;
            x=y;
            y=sum;
        }
        System.out.println(sum);
    }
}
