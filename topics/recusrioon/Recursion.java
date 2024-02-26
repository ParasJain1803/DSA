public class Recursion {
    public static void main(String[] args) {
        // System.out.println(fact(3));
        // System.out.println(sum(3));  
        // System.out.println(tilingProblem(3));  
        // removeDuplicates("maarrvvii", 0, new StringBuilder(""), new boolean[26]);  
        System.out.println(friendsPairing(3));  
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sum(int n) {
        if (n==1) {
            return 1;
        }
        return n+sum(n-1);
    }

    public static int tilingProblem (int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return tilingProblem(n-1) + tilingProblem(n-2);

        // kaam
        // vertical choice
        // int vC = tilingProblem(n-1);

        //horizontal choice
        // int hC = tilingProblem(n-2);

        // total ways
        // int totWays = vC + hC;

    }

    public static void removeDuplicates(String str, int i, StringBuilder newStr, boolean[] map) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, i+1, newStr, map);
        }
        else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, i+1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        if (n == 1 || n == 2) {
            return n;   
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);

        // choice
        // single
        // int fnm1 = friendsPairing(n-1);

        // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1)*fnm2;

        // int totWays = fnm1 + pairWays;
    }
}