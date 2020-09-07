package com.zh.test;

/**
 * @author Zhaohui
 * @date 2020/7/5
 */
public class Test0705 {
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    System.out.println("******");
                    System.out.println("i="+i);
                    System.out.println("j="+j);
                    System.out.println("sum="+sum);
                    System.out.println("******");
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(minSubArrayLen(6, arr));
    }
}
