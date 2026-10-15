class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int v1 = 0;
        int v2 = 0;

        for(int i = 0 ; i < nums1.length ; i++){

            for(int j = 0 ; j < nums2.length ; j++){

                if(nums1[i] == nums2[j]){
                    v1++;
                    break;
                }
            }
        }

        for(int i = 0 ; i < nums2.length ; i++){

            for(int j = 0 ; j < nums1.length ; j++){

                if(nums2[i] == nums1[j]){
                    v2++;
                    break;
                }
            }
        }

        return new int[]{v1,v2};

    }
}