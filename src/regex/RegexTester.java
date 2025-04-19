package regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {
    public void testRegex() {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher("111-223-3345");
        System.out.println(matcher.matches());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
