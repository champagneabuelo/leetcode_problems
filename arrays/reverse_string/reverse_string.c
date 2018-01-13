void reverseString(int* nums, int start, int finish) {
    int front = start;
    int back = finish;
    while (front < back) {
        nums[front] = nums[front] ^ nums[back];
        nums[back] = nums[front] ^ nums[back];
        nums[front] = nums[front] ^ nums[back];
        front += 1;
        back -= 1;
    }
}

void rotate(int* nums, int numsSize, int k) {
    int finish = k % numsSize;
    reverseString(nums, 0, numsSize-1);
    reverseString(nums, 0, finish-1);
    reverseString(nums, finish, numsSize-1);
}
