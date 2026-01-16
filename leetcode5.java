public class leetcode5 {
    public static void main(String[] args) {
        String[] arr={"flower","flow","flare"};
        System.out.println(prefix(arr));
    }
    static String prefix(String[] arr){
        String result="";
        for (int i = 0; i < arr[0].length(); i++) {
            char ch=arr[0].charAt(i);
            for (int j = 1; j <arr.length ; j++) {
                if(i>=arr[j].length()||arr[j].charAt(i)!=ch){
                    return result;
                }
            }
            result=result+ch;
        }
        return result;
    }
}
