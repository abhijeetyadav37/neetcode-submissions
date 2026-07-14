class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        HashMap<Object, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            Integer p = map.put(pattern.charAt(i), i);
            Integer w = map.put(words[i], i);

            if (!Objects.equals(p, w))
                return false;
        }

        return true;
    }
}