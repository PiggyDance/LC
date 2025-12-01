package io.piggydance.java;

public class LC41Java {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != i+1 && nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i]-1]) {
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (i+1 != nums[i]) {
                return i+1;
            }
        }
        return nums.length + 1;
    }
}
