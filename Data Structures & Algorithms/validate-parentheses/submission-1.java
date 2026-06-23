class Solution {
    public boolean isValid(String s) {

        while (true) {
            
    String prev = s;

    s = s.replace("()", "");
    s = s.replace("[]", "");
    s = s.replace("{}", "");

    if (s.equals(prev)) {
        break;
    }
}

return s.isEmpty(); // return true if empty , flase if not empty
        
    }
}
