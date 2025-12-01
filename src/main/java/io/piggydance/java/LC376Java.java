package io.piggydance.java;

public class LC376Java {
    public int wiggleMaxLength(int[] nums) {
        int[] dpUp = new int[nums.length];
        int[] dpDown = new int[nums.length];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i-1]) {
                dpUp[i] = dpDown[i-1] + 1;
                dpDown[i] = dpDown[i-1];
            } else if (nums[i] < nums[i-1]) {
                dpDown[i] = dpUp[i-1] + 1;
                dpUp[i] = dpUp[i-1];
            } else {
                dpDown[i] = dpDown[i-1];
                dpUp[i] = dpUp[i-1];
            }
        }
        return Math.max(dpUp[nums.length-1], dpDown[nums.length-1]) + 1;
    }
}
