/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
    int* result = malloc(2*sizeof(int));
    int i, j;
    bool found = false;
    for (i = 0; i < numsSize; i++) {
        if (found) {
            break;
        }
        int currIndex = i;
        int currValue = nums[i];
        int searchValue = target - nums[i];
        for (j = 0; j < numsSize; j++) {
            int matchIndex = j;
            int matchValue = nums[j];
            if (matchIndex == currIndex) {
                continue;
            } else if (matchValue == searchValue) {
                result[0] = currIndex;
                result[1] = matchIndex;
                found = true;
                break;
            }
        }
    }
    return result;
}
