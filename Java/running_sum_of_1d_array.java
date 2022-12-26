public class running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        System.out.print(runningSum[0]);
        for(int i=1;i<nums.length;i++){
            runningSum[i] =nums[i] +runningSum[i-1];
            System.out.print(","+runningSum[i]);
        }
    }
}
