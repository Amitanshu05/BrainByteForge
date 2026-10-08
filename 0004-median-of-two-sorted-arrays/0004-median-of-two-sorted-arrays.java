class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;

        ArrayList<Integer> al = new ArrayList<>();

        for(int n : nums1){
            al.add(n);
        }

        for(int n : nums2){
            al.add(n);
        }

        Collections.sort(al);

        int p1 =0;
        int p2 = al.size() - 1;

        while(p1 < p2){
            p1++;
            p2--;
        }

        if(p1 == p2){
            return al.get(p1);
        }

        else{
            return (double)(al.get(p1--) + al.get(p2++))/ 2;
        }
    }
}