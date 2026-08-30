import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        boolean[] used = new boolean[nums2.length];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j] && !used[j]) {

                    result.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}