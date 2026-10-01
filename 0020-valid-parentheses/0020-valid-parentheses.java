class Solution {
    public boolean isValid(String s) {
        if(s.length() <=1) return false;
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char str = s.charAt(i);
            if(st.isEmpty()){
                st.push(str);
            }

            else if(str == ')' && st.peek() == '(' || str == '}' && st.peek() == '{' || str == ']' && st.peek() == '['){
                st.pop();
            }

            else{
                st.push(str);
            }
        }

        if(st.isEmpty()){
            return true;
        }

        else return false;
    }
}