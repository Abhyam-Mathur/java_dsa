//1095. Find in Mountain Array
/*Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
*/
public class leetcode4 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,3,1};
        int target=3;
        System.out.println(result(arr,target));
    }
    static int result(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        int lf=leftbs(arr,target,start);
        if(lf!=-1){
            return lf;
        }
        return rightbs(arr,target,start);
    }
    static int rightbs(int[] arr,int target,int peak){
        int start=peak+1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                start=mid+1;
            } else if (target>arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int leftbs(int [] arr,int target,int peak){
        int start=0;
        int end=peak;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
