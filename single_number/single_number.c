int singleNumber(int* nums, int numsSize) {
    int ret = 0;
    int i;
    for (i = 0; i < numsSize; i++) {
        ret = ret ^ nums[i];
    }
    return ret;
}
