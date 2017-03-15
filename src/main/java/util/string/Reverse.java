package util.string;

/**
 * Created by mehdi on 15/03/2017.
 */
public class Reverse {

    // Solution1: Reverse using StringBuffer Example
    public static String reverseStringBuffer(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    public static String reverseStringBuilder(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    // Solution2: Reverse using Char Array Example
    public static String reverseCharArray(String s) {
        char[] reverseStringArray = new char[s.length()];
        for (int i = s.length() - 1, j = 0; i != -1; i--, j++) {
            reverseStringArray[j] = s.charAt(i);
        }
        return new String(reverseStringArray);
    }

    // Solution3: Reverse using String Variable Example
    public static String reverseStringVariable(String s) {
        String reverseStringVariable = "";
        for (int i = s.length() - 1; i != -1; i--) {
            reverseStringVariable += s.charAt(i);
        }
        return reverseStringVariable;
    }

    // Solution4: Reverse using Recursion Example
    public static String reverseRecursion(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverseRecursion(s.substring(1, s.length())) + s.charAt(0);
    }

    // Solution5 ; Use StringBuilder without reverse method
    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }
}
