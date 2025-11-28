package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ca");
        Matcher matcher = pattern.matcher("rca");
    }
}
