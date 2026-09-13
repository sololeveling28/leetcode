class Solution {
    public String triangleType(int[] nums) {
        for(int i = 2;i<nums.length;i++){
            if((nums[i-1] == nums[i] && nums[i] == nums[i-2] ) && (nums[i]+nums[i-1] > nums[i-2] && nums[i]+nums[i-2] > nums[i-1] && nums[i-1]+nums[i-2] >nums[i])){
                return "equilateral";
            }else if((nums[i] == nums[i-1] || nums[i] == nums[i-2] || nums[i-1] == nums[i-2]) && (nums[i]+nums[i-1] > nums[i-2] && nums[i]+nums[i-2] > nums[i-1] && nums[i-1]+nums[i-2] >nums[i])){
                return "isosceles";
            }else if(nums[i]+nums[i-1] > nums[i-2] && nums[i]+nums[i-2] > nums[i-1] && nums[i-1]+nums[i-2] >nums[i]){
                return "scalene";
            }
        }
        return "none";
    }
}