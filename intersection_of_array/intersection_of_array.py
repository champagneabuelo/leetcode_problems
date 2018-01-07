class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        intersection_map = dict()
        for n in nums1:
            if n in intersection_map.keys():
                intersection_map[n] += 1
            else:
                intersection_map[n] = 1
        
        results = list()
        for n in nums2:
            if n in intersection_map.keys():
                if intersection_map[n] > 1:
                    intersection_map[n] -= 1
                else:
                    intersection_map.pop(n, None)
                results.append(n)
        
        return results
