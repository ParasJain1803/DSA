public class Strings {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }  
        }
        return true;
    }

    public static float shortestPath(String str1) {
        int x,y;
        x=y=0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'W') {
                x--;
            }
            else if (str1.charAt(i) == 'E') {
                x++;
            }
            else if (str1.charAt(i) == 'N') {
                y++;
            }
            else {
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }

    public static String compress(String str2) {
        StringBuilder newStr = new StringBuilder("");

        for (int i=0; i<str2.length(); i++) {
            Integer count = 1;
            while (i<str2.length()-1 && str2.charAt(i)==str2.charAt(i+1)) {
                count++;
                i++;
            }
            newStr.append(str2.charAt(i));
            if (count>1) {
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
    public static void main (String[] args) {
        //String str = "noona";
        //System.out.print(isPalindrome(str));
        // String str1 = "WNEENESENNN"; 
        // System.out.println(shortestPath(str1));
        String str2 = "WNEENESENNN"; 
        System.out.println(compress(str2));
    }
}