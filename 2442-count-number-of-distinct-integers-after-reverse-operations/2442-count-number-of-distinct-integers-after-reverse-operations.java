class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            int sum = 0;
            while (num > 0) {

                int r = num % 10;
                sum = sum * 10 + r;
                num = num / 10;
            }
            set.add(sum);

        }
        return set.size();
    }
}