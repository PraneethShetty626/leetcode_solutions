import java.util.regex.*;
public class Problem10 {
    public boolean isMatching(String s, String p){
        Pattern reg= Pattern.compile(p);
        Matcher match=reg.matcher(s);

        return match.find();
    }
}
