
"""
Problem: https://leetcode.com/problems/contains-duplicate
Find if a given array of integers contains duplicates.

@author: Vivek Wisdom
@version: 1.0
@date: 2022-07-15
"""


from typing import List

class Solution:
    """
    Class wrapper form contains_duplicate.py
    """
    def contains_duplicate_set(self, nums: List[int]) -> bool:
        """
        :type nums: List[int]
        :rtype: bool
        """
        return len(nums) != len(set(nums))

    def contains_duplicate_manual(self, nums: List[int]) -> bool:
        """
        :type nums: List[int]
        :rtype: bool
        """
        duplicate_dict = {}
        for num in nums:
            if num not in duplicate_dict:
                duplicate_dict[num] = 1
            else:
                return True
        return False

    def contains_duplicate_withhout_dict(self, nums: List[int]) -> bool:
        """
        :type nums: List[int]
        :rtype: bool
        """
        nums_set = set()
        for num in nums:
            if num not in nums_set:
                nums_set.add(num)
            else:
                return True
        return False

if __name__ == "__main__":

    sol = Solution()
    print(sol.contains_duplicate_set([1,2,3,1]))
    print(sol.contains_duplicate_manual([1,2,3,4,4]))
    print(sol.contains_duplicate_withhout_dict([1,2,3,4,4]))
