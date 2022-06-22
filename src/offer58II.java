public class offer58II {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] s_array = s.toCharArray();
        for (int index = n; index < s.length();index++) {
            sb.append(s_array[index]);
        }
        for (int index = 0; index < n;index++) {
            sb.append(s_array[index]);
        }
        return sb.toString();
    }
}
