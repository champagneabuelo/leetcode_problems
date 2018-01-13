#include <stdio.h>
#include <stdlib.h>
/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
typedef struct {
    int key;
    int value;
} Map;

int length(int* returnSize) {
    int i = 0;
    while (returnSize[i] != '\0') {
        i++;
    }
    return i;
}

Map createNew(int k, int v) {
    Map m;
    m.key = k;
    m.value = v;
    return m;
}

void setValue(Map *map, int v) {
    map->value = v;
} 

int getValue(Map *map) {
    return map->value;
}

int getKey(Map map) {
    return map.key;
}

int containsKey(Map* map, int length, int key) {
    int i;
    for (i = 0; i < length; i++) {
        int mapkey = getKey(map[i]);
        if (key == mapkey) {
            return i;
        }
    }
    return -1;
}

int* intersect(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int size = length(returnSize);
    printf("size of return: %d\n", size);
    int* result = malloc(size * sizeof(int));
    int result_length = 0;
    Map *map = malloc(size * sizeof(Map));
    int map_length = 0;
    int i;
    
    for (i = 0; i < nums1Size; i++) {
        int mapindex = containsKey(map, map_length, nums1[i]);
        if (mapindex >= 0) {
            int currvalue = getValue(&map[mapindex]);
            currvalue += 1;
            setValue(&map[mapindex], currvalue);
            printf("incrementing existing key %d to %d\n", map[mapindex].key, map[mapindex].value);
        } else {
            Map new_map = createNew(nums1[i], 1);
            map[map_length] = new_map;
            map_length++;
            printf("created new map: %d\n", new_map.key);
        }
    }
    
    for (i = 0; i < nums2Size; i++) {
        int mapindex = containsKey(map, map_length, nums2[i]);
        if (mapindex >= 0) {
            Map currmap = map[mapindex];
            int currvalue = getValue(&currmap);
            if (currvalue > 0) {
                currvalue -= 1;
                setValue(&currmap, currvalue);
                result[result_length] = nums2[i];
                result_length += 1;
            }
        }
    }
    
    return result;
}

int main() {
    int array1[6]= {4,7,9,7,6,7};
    int array2[9] = {5,0,0,6,1,6,2,2,4};
    int results[3];
    int* answer = intersect(array1,6, array2,9,results);
    
    printf("%d\n", answer[0]);
    printf("%d", answer[1]);

    return 0;
}
