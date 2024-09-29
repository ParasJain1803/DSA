public class subsets {
    public static void main(String[] args) {
        findSubsets("abc", "", 0);
    }


    public static void findSubsets(String str, String ans, int i) {
        //base case 
        if (i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        //recursion
        findSubsets(str, ans + str.charAt(i), i+1);
        findSubsets(str, ans, i+1);     //backTracking
    }
}
