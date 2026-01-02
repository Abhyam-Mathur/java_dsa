import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a =in.nextInt();
        int count=0;
        for (int n = 1; n < a ; n++) {
            if(a%n==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("Not a prime no");
        }
        else{
            System.out.println("prime no");
        }
    }
}
