public class LengthFilter implements Filter {

    private int minLength; // Минимальная длина
    private int maxLength; // Максимальная длина

    public LengthFilter(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    @Override
    public boolean apply(String str) {
        return str.length() >= minLength && str.length() <= maxLength;
    }
}
