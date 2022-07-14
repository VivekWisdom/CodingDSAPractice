#!/usr/bin/env python
# -*- coding: utf-8 -*-

"""FizzBuzz

@author: Vivek Wisdom
@version: 1.0
@date: 2022-07-15
"""



def fizzbuzz():
    """
    Write a program that outputs the string representation of numbers from 1 to n.
    But for multiples of three it should output “Fizz” instead of the number and for
    the multiples of five output “Buzz”.
    For numbers which are multiples of both three and five output “FizzBuzz”.
    :rtype: void
    """
    for i in range(1, 101):
        if i % 3 == 0 and i % 5 == 0:
            print("FizzBuzz")
        elif i % 3 == 0:
            print("Fizz")
        elif i % 5 == 0:
            print("Buzz")
        else:
            print(i)
