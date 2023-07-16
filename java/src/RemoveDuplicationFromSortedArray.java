class RemoveDuplicationFromSortedArray {
    public static int RemoveDuplicationFromSortedArray(int[] nums) {
        int size = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[size++] = nums[i + 1];
            }
        };

        nums = new int[size];
        return nums.length;
    }
}


