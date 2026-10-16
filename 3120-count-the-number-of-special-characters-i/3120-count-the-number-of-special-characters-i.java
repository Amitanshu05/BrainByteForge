class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            char uppercase = Character.toUpperCase(c);

            if (word.indexOf(c) != -1 && word.indexOf(uppercase) != -1) {
                count++;
            }
        }

        return count;
    }
}