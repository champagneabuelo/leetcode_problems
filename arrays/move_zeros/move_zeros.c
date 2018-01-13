void moveZeroes(int* nums, int numsSize) {
    int i = 0;
    int j = 1; 
    while (j < numsSize) {
        while (i < numsSize-1 && nums[i] != 0) {
            i++;
            if (i == j) {
                j++;
            }
        }
        if (i == numsSize-1) {
            break;
        }
        int swapValue = nums[i];
        int iterValue = nums[j];
        if (swapValue == 0 && iterValue != 0) {
            nums[i] = iterValue;
            nums[j] = swapValue;
            i++;
        }
        j++;
    }
}
