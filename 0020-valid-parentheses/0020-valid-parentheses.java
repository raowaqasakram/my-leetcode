class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        Map map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (char c : s.toCharArray()) {
            if (c=='('  || c=='{' || c=='[' ) {
                stack.push(map.get(c));
            }
            else if (stack.empty() || (char) stack.pop() != c) return false;
        }
        return stack.empty();
    }

}