package stringExample;

public class AnagramOptimizedTwo {
    public static void main(String[] args) {
        String a = "cat";
        String b = "act";

        boolean isAnagram = true;

        int al[] = new int[256];

        for (int c: a.toCharArray()) {
            int index = (int)c;
            al[index]++;
        }
        for (int c: b.toCharArray()) {
            int index = (int)c;
            al[index]--;
        }

        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                isAnagram = false;
            }
        }

        if (isAnagram) {
            System.out.println("It is Anagram");
        }else {
            System.out.println("It is not anagram");
        }
    }
}
