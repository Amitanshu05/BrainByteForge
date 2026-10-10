class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder("");

        for(int i = 0 ; i < command.length() - 1 ; i++){
            char c = command.charAt(i);

            if(c == 'G'){
                sb.append('G');
            }

            else if(c == '(' && (command.charAt(i+1) == ')')){
                sb.append('o');
            }

            else if(c == '(' && (command.charAt(i+1) == 'a')){
                sb.append("al");
            }

            else{
                continue;
            }
        }

        if(command.charAt(command.length()-1) == 'G') sb.append('G');

        return sb.toString();
    }
}