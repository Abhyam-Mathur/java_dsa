import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is the largest number");
        } else if (b>a && b>c) {
            System.out.println(b + " is the largest number");}
        else{
                System.out.println(c + " is the largest number");
            }
        }
    }
