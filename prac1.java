import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size=in.nextInt();
        char[] ch=new char[size];
        System.out.println("enter the product id:");
        for (int i = 0; i <size ; i++) {
            ch[i]=in.next().charAt(0);
        }
        int result=desktop(ch);
        System.out.println(result);
    }
    static int desktop(char[] ch){
        int count=0;
        for (int i = 0; i <ch.length-1 ; i++) {
            if(ch[i]=='a'){
                count++;
            }
        }
        return ch.length-count;
    }
}
