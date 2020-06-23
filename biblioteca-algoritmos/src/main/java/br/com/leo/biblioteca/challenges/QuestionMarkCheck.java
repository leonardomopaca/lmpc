package br.com.leo.biblioteca.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMarkCheck {
    public static String QuestionMarks(String str){
        System.out.println(str);
        String numMarks = str.replaceAll("[^0-9?]", "");
        System.out.println(numMarks);
        System.out.println(str);
        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(numMarks);

        boolean matched = false;

        while (m.find()){
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));

            if (a + b == 10){
                if (match.length() != 5){
                    return "false";
                } else {
                    matched = true;
                }
            }
        }
        return matched ? "true" : "false";
    }
}
