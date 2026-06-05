public class MaxAvgSub {
        public double findMaxAverage(int[] nums, int k) {
            int n = nums.length;
            double window = 0;
            double ans =0;
            for(int i = 0; i<k; i++){
                window+=nums[i];
            }
            ans = window/k;
            for(int j = k; j<n; j++){
                window+= nums[j]-nums[j-k];
                ans = Math.max(ans, window/k);
            }
            return ans;
        }
    }

