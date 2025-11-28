package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".ca");
        Matcher matcher = pattern.matcher("rca");

        boolean result1 = matcher.matches();
        System.out.println(result1);

        boolean result2 = Pattern.compile("ca").matcher("rca").matches();
        System.out.println(result2);

        System.out.println(Pattern.matches("ca","rca"));
        System.out.println(Pattern.matches("[amn]", "amn"));
    }
}
