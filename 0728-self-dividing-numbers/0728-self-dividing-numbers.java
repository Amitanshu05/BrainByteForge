class Solution {
    public static boolean isSelfDividing(int num){
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            if(rem == 0){
                return false;
            }

            else if(num % rem != 0){
                return false;
            }

            temp = temp / 10;
        }

        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            if(isSelfDividing(i)){
                l.add(i);
            }
        }

        return l;
    }
}