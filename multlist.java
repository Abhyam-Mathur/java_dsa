import java.util.ArrayList;
import java.util.Scanner;
public class multlist {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array list");
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0;i<n;i++ ){         // initialization
            list.add(new ArrayList<>());
        }
        System.out.println("enter the elements in array list");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {         //adding elements
                list.get(j).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
