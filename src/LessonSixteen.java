import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonSixteen {
 /*   public static void main (String[] args){
        String value = "Hello 234 World123!!!";
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
                System.out.println(matcher.group());
        }

    }*/
 public static void main (String[] args){
     String value = "Hello 234 World123!!!";
     Pattern pattern = Pattern.compile("[a-z]+");
     Matcher matcher = pattern.matcher(value);
     if (matcher.find()) {
         System.out.println(matcher.group());
     }

 }
}
