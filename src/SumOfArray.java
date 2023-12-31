import java.util.Arrays;

public class SumOfArray {
    public static void sumOfArray(){
        int[] nums = {1, 2, 3};

        System.out.println(Arrays.toString(runningSum(nums)));
    }


//    Last Solution
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

//           1-Solution
//    public static int[] runningSum(int[] nums) {
//        int[] sumNums = new int[nums.length];
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            sumNums[i] = sum;
//        }
//        return sumNums;
//    }
}
