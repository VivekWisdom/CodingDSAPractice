#!/usr/bin/python
# -*- coding: utf-8 -*-

"""
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
Return k after placing the final result in the first k slots of nums.

# Problem URL: https://leetcode.com/problems/remove-element/

@param nums: List[int]
@param val: int
@return: int

@Author: Vivek Wisdom
@Created: 2024-09-07

"""

from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        
        pointer = 0
        for index in range(len(nums)):
            if nums[index] != val:
                nums[pointer] = nums[index]
                pointer = pointer + 1
                print(nums)
            else:
                continue
        
        return pointer

if __name__ == "__main__":
    solution = Solution()
    k = solution.removeElement([3,2,2,3], 3) # 2
    print(k)