import java.util.regex.Pattern;

public class RegexFilter implements Filter {

    private Pattern pattern; // Шаблон регулярного выражения

    public RegexFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean apply(String str) {
        return pattern.matcher(str).matches();
    }
}
