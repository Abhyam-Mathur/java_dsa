import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class arrlist {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array list");
        int l= in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(l);
        System.out.println("enter the elements in array ");
        for (int i = 0; i <l; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        }
    }

