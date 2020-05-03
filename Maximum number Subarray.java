class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n=nums.length;
        int max_end_here=0, maxsofar=0;
        int realmax=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            max_end_here+=nums[i];
            if(max_end_here<0)
            {
                max_end_here=0;
            }
            realmax=Math.max(realmax,nums[i]);
            
            if(max_end_here>maxsofar)
            {
                maxsofar=max_end_here;
            }
            
        }
        
        if(maxsofar==0)
        {
            return realmax;
        }
        return maxsofar;
        
    }
}
