public static String reverseString(String str) {
        int idx = 0;
        Stack<Character> s = new Stack<>();
        while(idx < str.length()) {
            s.push(str.charAt(idx));
        }
        StringBuilder ans = new StringBuilder("");
        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Paras";
        System.out.println(reverseString(str));
    }