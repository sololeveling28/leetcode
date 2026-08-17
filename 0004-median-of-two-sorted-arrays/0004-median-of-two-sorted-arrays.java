class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0.00d;
        int[] num = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            num[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            num[nums1.length + i] = nums2[i];
        }
        Arrays.sort(num);
        if (num.length % 2 != 0) {
            return num[num.length / 2];
        }

        return (num[num.length / 2] + num[num.length / 2 - 1])/2.0;

    }
}