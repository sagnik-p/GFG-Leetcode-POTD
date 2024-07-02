import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        if (nums1.length < nums2.length)
        {
            for (int i = 0; i < nums1.length; i++)
                if (table.containsKey(nums1[i]))
                    table.put(nums1[i], table.get(nums1[i]) + 1);
                else
                    table.put(nums1[i], 1);

            for (int i = 0; i < nums2.length; i++)
                if (table.containsKey(nums2[i]))
                {
                    table.put(nums2[i], table.get(nums2[i]) - 1);
                    ansList.add(nums2[i]);
                    if (table.get(nums2[i]) == 0)
                        table.remove(nums2[i]);
                }
        }
        else
        {
            for (int i = 0; i < nums2.length; i++)
                if (table.containsKey(nums2[i]))
                    table.put(nums2[i], table.get(nums2[i]) + 1);
                else
                    table.put(nums2[i], 1);
            for (int i = 0; i < nums1.length; i++)
                if (table.containsKey(nums1[i]))
                {
                    table.put(nums1[i], table.get(nums1[i]) - 1);
                    ansList.add(nums1[i]);
                    if (table.get(nums1[i]) == 0)
                        table.remove(nums1[i]);
                }
        }
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++)
            ans[i] = ansList.get(i);
        return ans;
    }
}