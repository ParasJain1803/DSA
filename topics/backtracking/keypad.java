
public class keypad {
    final char[][] K = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},
                        {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static void letterComb (String A) {
        int len = A.length();
        if(len == 0) {
            System.out.println("");
            return;
        }

        bfs(0, len, new StringBuilder(), A);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String A) {
        if(pos == len) {
            System.out.println(sb.toString());
        }
    }
}
