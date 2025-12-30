import java.util.Scanner;
public class calcfun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no");
        int a= in.nextInt();
        int b= in.nextInt();
        int result = sum(a,b);
        System.out.println("sum of two no is: "+ result );
    }
    static int sum(int a, int b){
        int result= a+b;
        return result;
    }
}
