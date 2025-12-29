import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char a = in.next().trim().charAt(0);
        if(a>='a'&& a<='z'){
            System.out.println("Lowercase");
        }
        else if(a>='A' && a<='Z') {
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Special character");
        }
    }
}
