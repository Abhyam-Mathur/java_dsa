import java.util.Scanner;
public class calcfun {
    public static void main(String[] args) {
    sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no");
        int a= in.nextInt();
        int b= in.nextInt();
        int result= a+b;
        System.out.println("sum is: "+result);
    }
}
