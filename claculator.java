import java.util.Scanner;
public class claculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("welcome to calculator");
        int result = 0;
        char press = ' ';
        do {
            System.out.println("enter the operator for the operation :");
            char c = in.next().trim().charAt(0);
            if (c == '+' || c == '*' || c == '/' || c == '-' || c == '%') {
                System.out.println("enter the 2 integer no");
                int a = in.nextInt();
                int b = in.nextInt();
                if (c == '+') {
                    System.out.println(result = a + b);
                } else if (c == '-') {
                    System.out.println(result = a - b);
                } else if (c == '*') {
                    System.out.println(result = a * b);
                } else if (c == '/') {
                    if(b!=0){
                        System.out.println(result=a/b);
                    }
                    else{
                        System.out.println("invalid input denominator cannot be zero");
                    }
                } else if (c == '%') {
                    if(b!=0) {
                        System.out.println(result = a % b);
                    }
                    else{
                        System.out.println("invalid");
                    }
                } else {
                    System.out.println("invalid operator");
                }
                System.out.println("press x to exit or anyother key to continue: ");
                char p = in.next().trim().charAt(0);
                press = p;
            }}while (press != 'x' && press !='X') ;
        }
    }

