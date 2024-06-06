public class StringProcessor {
    public static String multiplyString(String s, int N) {
        if (N < 0) {
            throw new IllegalArgumentException("N can't be negative");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(s);
        }
        return result.toString();
    }
    public static int countSubstring(String str, String substr) {
        if (substr == null || substr.isEmpty()) {
            throw new IllegalArgumentException("Substring can't be null or empty");
        }
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count;
    }
    public static String replaceDigits(String str) {
        return str.replaceAll("1", "один")
                .replaceAll("2", "два")
                .replaceAll("3", "три");
    }
    public static void deleteEverySecondChar(StringBuilder sb) {
        for (int i = sb.length() - 1; i >= 0; i -= 2) {
            sb.deleteCharAt(i);
        }
    }

    public static String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(" ").append(words[i]);
        }
        return result.toString().trim();
    }
    public static String replaceHexToDecimal(String input) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while (true) {
            int hexStart = input.indexOf("0x", start);
            if (hexStart == -1) {
                sb.append(input, start, input.length());
                break;
            }
            sb.append(input, start, hexStart);
            int hexEnd = input.indexOf(" ", hexStart);
            if (hexEnd == -1) {
                hexEnd = input.length();
            }
            String hex = input.substring(hexStart + 2, hexEnd).replaceFirst("^0+(?!$)", "");
            long decimal = Long.parseLong(hex, 16);
            sb.append("0x").append(hex).append(" ").append(decimal);
            start = hexEnd;
        }
        return sb.toString().trim();
    }

}
