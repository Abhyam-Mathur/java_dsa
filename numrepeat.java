import java.util.Scanner;
public class numrepeat {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no: ");
        String n= in.next();
        for (int i = 0; i <n.length() ; i++) {
            char c=n.charAt(i);int count=0;
            for (int j = i; j <n.length() ; j++) {
                if(c==n.charAt(j)){
                    count++;
                }
            }
            if (count>1){
                System.out.println("no repeated is: "+c);
            }
        }
    }
}