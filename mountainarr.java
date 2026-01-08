//852. Peak Index in a Mountain Array
public class mountainarr {
    public static void main(String[] args) {
        int [] arr={0,1,0};
        System.out.println(bs(arr));
    }
    static int bs(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
