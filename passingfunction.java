import java.util.Arrays;

public class passingfunction {
    public static void main(String[] args){
        int[] arr={3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
        }
        static void change(int [] nums){
        nums[0]=88;
    }
}
