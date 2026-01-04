import java.util.Scanner;
public class strsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s= in.nextLine();
        System.out.println("Enter the char you want to search? ");
        char a=in.next().charAt(0);
        search(s,a);
    }
    static void search(String s,char a){
        for (int i = 0; i < s.length(); i++) {
            char x=s.charAt(i);
            if(x==a){
                System.out.println("element found at "+i);
            }
        }
    }
}
