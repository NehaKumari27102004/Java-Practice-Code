package Array;

public class SubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + isSubsequence(s1, t1));


        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Is \"" + s2 + "\" a subsequence of \"" + t2 + "\"? " + isSubsequence(s2, t2));

        
        String s3 = "ace";
        String t3 = "abcde";
        System.out.println("Is \"" + s3 + "\" a subsequence of \"" + t3 + "\"? " + isSubsequence(s3, t3));
    }
}
