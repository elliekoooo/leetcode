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
    };

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3,3,4,4,4,4,5};
        RemoveDuplicationFromSortedArray(nums);
    };
}


