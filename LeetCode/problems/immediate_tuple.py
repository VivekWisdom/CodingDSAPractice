#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Given a list of numbers return the immediate tuple of numbers.

# a = [2,4,3,6,5,7]
# result = [(2,4), (4,3).....]

@author: Vivek Wisdom
@version: 1.0
@date: 2022-07-15
"""




def return_immediate_tuple(nums):
    """
    This is a linear time algorithm.
    """
    nums_length = len(nums)
    return [(nums[j], nums[i]) for j, i in enumerate(range(1, nums_length))]




if __name__ == "__main__":
    print(return_immediate_tuple([2, 3, 4, 5, 6, 7]))
