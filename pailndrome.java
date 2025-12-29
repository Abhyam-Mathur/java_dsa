import java.util.Scanner;
public class pailndrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no ");
        int a = in.nextInt();
        while(a>0){
            int r=a%10;
            a=a/10;
            System.out.print(r);
        }
    }
}