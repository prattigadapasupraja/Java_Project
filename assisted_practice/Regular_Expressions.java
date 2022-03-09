package assisted_practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular_Expressions {
	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String pattern1 = "[A-Z]+";
		String check = "Regular Expressions Program";
		Pattern p = Pattern.compile(pattern);
		Pattern q = Pattern.compile(pattern1);
		Matcher c = p.matcher(check);
		Matcher d = q.matcher(check);
		while (c.find())
	      	System.out.println( check.substring( c.start(),c.end() ) );
	    while (d.find())
	    	System.out.println( check.substring( d.start(), d.end() ) );
	}
}
