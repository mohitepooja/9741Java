import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches{
private static String regex="dog";
private static String input="The dog says meow."+"All dogs says meow";
private static String replace="cat";
public static void main(String args[]){
Pattern p=Pattern.compile(regex);
Matcher m=p.matcher(input);
input=m.replaceAll(replace);
System.out.println(input);
}}
