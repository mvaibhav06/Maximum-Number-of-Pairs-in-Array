class NumberOfPairs {
    public int[] numberOfPairs(int[] nums) {
        if(nums.length==1){
            return new int[]{0,1};
        }
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int[] out = new int[2];
        // 1,1,2,2,2,3,3
        while(i<j && j<nums.length){
            if(nums[i]==nums[j]){
                out[0]++;
                nums[i] = -1;
                nums[j] = -1;
                i = j+1;
                j = i+1;
            }else{
                i++;
                j++;
            }
        }
        for(int p=0; p<nums.length; p++){
            if(nums[p] != -1){
                out[1]++;
            }
        }
        return out;
    }
}
