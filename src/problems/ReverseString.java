package problems;

public class ReverseString {
    public static void main(String[] args) {
        String s = "The sky is blue";

        String ans = reverseWord(s);

        System.out.println(ans);
    }
    public static String reverseWord(String s) {
        int i = s.length()-1;
        String ans = " ";

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')i--;
            int j = i;

            if (i < 0) break;

            while (i >= 0 && s.charAt(i) != ' ')i--;

            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i+1, j+1));
            } else {
                ans = ans.concat(" " + s.substring(i+1,j+1));
            }
        }
        return ans;
    }
}
