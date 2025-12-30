import java.util.Scanner;
public class Eswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the fruit name: ");
        String friut = in.next();

        switch (friut) {
            case " mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("red fruit");
            case "grapes" -> System.out.println("green colour fruit");
            default -> System.out.println("enter a valid fruit name");
        }
    }
}
