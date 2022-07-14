#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""You are given an integer num. Rearrange the digits of num such that its
value is minimized and it does not contain any leading zeros.

Example 310, 9005 310, 103, 031

@author: Vivek Wisdom
@version: 1.0
@date: 2022-07-15
"""


def rearrange_number(num):
    """
    This is a linear time algorithm.
    """
    all_time_list =[]

    str_num = str(num)
    str_length = len(str_num)

    all_time_list.extend(int(str_num << i) for i in range(1, str_length - 1))
