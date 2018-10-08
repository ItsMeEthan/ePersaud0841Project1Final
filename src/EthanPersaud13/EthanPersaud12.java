package EthanPersaud13;

public class EthanPersaud12 {
    public static boolean isPalindrome(String s)
    {
        //first make sure integer = the length of the string
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

}
