bool containsDuplicate(int* nums, int numsSize) {
    int i;
    int j;
    for (i = 0; i < numsSize; i++) {
        int currentIndex = i;
        int currentValue = nums[i];
        for (j = i+1; j < numsSize; j++) {
            if (nums[j] == currentValue) {
                return true;
            }
        }
    }
    return false; 
}
