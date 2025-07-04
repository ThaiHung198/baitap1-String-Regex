import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    private static final Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);

    public ClassExample() {
    }

    public boolean validate(String className) {
        if (className == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
