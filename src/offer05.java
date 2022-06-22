public class offer05 {
    public String replaceSpace(String s) {
        char[] s_array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char a: s_array) {
            if (a==' ') {
                sb.append("%s");
            } else {
                sb.append(a);
            }
        }
        return sb.toString();
    }
}
