public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        int[] occurences = new int[58];
        int[] occurencet = new int[58];
        for (char character: s.toCharArray()) {
            occurences[(int) character - 65]++;
        }
        for (char character: t.toCharArray()) {
            occurencet[(int) character - 65]++;
        }
        for (int index = 0; index < occurences.length; index++) {
            if (occurencet[index] != occurences[index]) return false;
        }
        return true;
    }
}
