#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""Input a array like [1, 2, 3, 9] and output the pair of numbers that sum
to a given number for e.g. 8

Test Cases:
Test Case 1 = [1, 2, 3, 9]  targetsum 8

Test Case 2 = [1, 2, 4, 4] targetsum 8

@author: Vivek Wisdom
@version: 1.0
@date: 2022-07-15
"""

import time


def sum_values_number_quardratic(nums: list[int], targetsum:int):
    """
    This is a quadratic time algorithm.
    """
    length_arr = len(nums)
    return_string = ""
    for i in range(length_arr):
        for j in range(i+1, length_arr):
            if (nums[i] + nums[j]) == targetsum:
                return_string = return_string + str(i) + " and " + str(j) + "\n"

    return return_string

def sum_values_number_linear(nums: list[int], targetsum:int):
    """
    This is a linear time algorithm.
    """
    return_string = ""
    low: int = 0
    high: int = len(nums) -1

    while low < high:
        new_sum = nums[low] + nums[high]
        if new_sum == targetsum:
            return_string = return_string + str(low) + " and " + str(high) + "\n"
            low+=1
        elif new_sum < targetsum:
            low+=1
        elif new_sum > targetsum:
            high-=1
    return return_string


def sum_values_number_hash(nums: list[int], targetsum:int):

    """
    This is a hash table algorithm.
    """

    return_string = ""

    comp: set[int] = set()

    for val in nums:
        if val in comp:
            return_string += "True\n"
        else:
            comp.add(targetsum-val)
    return return_string

if __name__ == "__main__":
    sample_nums = [1, 2, 3, 4, 4, 5, 6, 7]
    TARGET_SUM = 8
    print(sample_nums)
    start = time.time()
    # print(sum_values_number_quardratic(sample_nums, targetsum))

    # print(sumValuesToANumberLinear(sample_nums, targetsum))

    print(sum_values_number_hash(sample_nums, TARGET_SUM))
    print(time.time() - start)
