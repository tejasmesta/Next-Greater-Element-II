class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        
        int ans[] = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        Arrays.fill(ans,-1);
        
        for(int i=0;i<n*2;i++)
        {
            while(!st.isEmpty() && nums[st.peek()]<nums[i%n])
            {
                ans[st.pop()] =nums[i%n];
            }
            st.push(i%n);
        }
        
        return ans;
        
    }
}

