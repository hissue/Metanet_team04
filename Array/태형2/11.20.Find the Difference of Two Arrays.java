

  class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> distinctInNums1 = new ArrayList<>();
        List<Integer> distinctInNums2 = new ArrayList<>();
        
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinctInNums1.add(num);
            }
        }
        
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinctInNums2.add(num);
            }
        }
        
        result.add(distinctInNums1);
        result.add(distinctInNums2);
        
        return result;

    }
}
