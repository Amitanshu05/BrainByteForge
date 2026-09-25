class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            int element = arr[i];

            hm.put(element , hm.getOrDefault(element , 0) + 1);
        }

        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for(Integer key : hm.keySet()){
            int value = hm.get(key);
            hm2.put(value , hm2.getOrDefault(value,0) + 1);
        }

        for(Integer key2 : hm2.keySet()){
            int value = hm2.get(key2);
            if(value > 1){
                return false;
            }            
        }


        return true;
        
    }
}