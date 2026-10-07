class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c1 = coordinates.charAt(0);
        char c2 = coordinates.charAt(1);

        if((c1 - 'a') % 2 == 0 && (c2 - '0') % 2 != 0) return false;
        else if((c1 - 'a') % 2 != 0 && (c2 - '0') % 2 == 0) return false;
        return true;
    }
}