class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> exists = new ArrayList<>();

        for (int num : nums) {
            if (exists.contains(num)) {
                return true;
            } 
            exists.add(num);
        }

        return false;
    }
}