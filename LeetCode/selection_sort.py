#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""
Selection Sort Algorithm Implementation


@author: Vivek Wisdom
@version: 1.0
@date: 2022-07-15
"""


def selection_sort_me(arr):
    """
    Selection sort algorithm.
    :type arr: List[int]
    :rtype: void Do not return anything, modify arr in-place instead.

    """
    for i in range(len(arr)-1):

        min_index = i

        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]

def selection_sort(array_name):
    """
    Selection sort algorithm.
    :type array_name: List[int]
    :rtype: void Do not return anything, modify array_name in-place instead.
    """
    for i in range(len(array_name) - 1):
        # The last value will automatically be in correct position.
        # Find minimum value in unsorted region.
        min_index = i
        for j in range(i + 1, len(array_name)):
            # Update min_index if the value at j is lower than current minimum value.
            if array_name[j] < array_name[min_index]:
                min_index = j
        # After finding the minimum value in the unsorted region,
        # swap with the first unsorted value.
        array_name[i], array_name[min_index] = array_name[min_index], array_name[i]




if __name__ == "__main__":
    data = [1, 5, 6 ,7, 8, 9, 2, 3]

    print(data)
    selection_sort_me(data)
    print(data)

    # # array_name = [3, 2, 1, 5, 4]
    # array_name = [-4, 2, 5, 8, -7, 3, 6, -1, 7]
    # array_name = [1, 5, 6 ,7, 8, 9, 2, 3]
    # print(array_name)
    # selection_sort(array_name)
    # print(array_name)
    # print(all(array_name[i] <= array_name[i + 1] for i in range(len(array_name) - 1)))
    # # A nice Pythonic way to check list is sorted.
