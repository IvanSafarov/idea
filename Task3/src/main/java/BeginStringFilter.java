import java.util.Objects;
/**
 * Реализация интерфейса Filter, фильтрующая строки по начальной подстроке.
 */
public class BeginStringFilter implements Filter {
    private String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeginStringFilter that = (BeginStringFilter) o;
        return Objects.equals(pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    @Override
    public String toString() {
        return "BeginStringFilter{" +
                "pattern='" + pattern + '\'' +
                '}';
    }
}
