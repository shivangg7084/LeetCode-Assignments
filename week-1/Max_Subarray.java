public class Max_Subarray {
    public int maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            maxi = Math.max(sum, maxi);
            if(sum<0){
                sum= 0;
            }
        }
        return (int) maxi;
    }
}

