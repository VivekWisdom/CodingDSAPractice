# compareTwoArraysSum

""" 
Input a array like [1, 2, 3, 9] and out put the pair of numbers that total to a given number for e.g. 8


Test Case:

[1, 2, 3, 9]  total 8

[1, 2, 4, 4] total 8

 """

import time

def sumValuesToANumberQuardratic(nums: list[int], total:int):
    lengthArr = len(nums)
    returnString = ""
    for i in range(lengthArr):
        for j in range(i+1, lengthArr):
            if (nums[i] + nums[j]) == total:
                returnString = returnString + str(i) + " and " + str(j) + "\n"

    return returnString

def sumValuesToANumberLinear(nums: list[int], total:int):
    returnString = ""
    low: int = 0
    high: int = len(nums) -1

    while (low < high):
        newSum = nums[low] + nums[high]
        if newSum == total:
            returnString = returnString + str(low) + " and " + str(high) + "\n"
            low+=1
        elif newSum < total:
            low+=1
        elif newSum > total:
            high-=1
    return returnString


def sumValuesToANumberHash(nums: list[int], total:int):
    returnString = ""

    comp: set[int] = set()

    for val in nums:
        if val in comp:
            returnString += "True\n"
        else:
            comp.add(total-val)
    
    return returnString

nums = [1, 2, 3, 4, 4, 5, 6, 7]
total = 8
print(nums)
start = time.time()
# print(sumValuesToANumberQuardratic(nums, total))

# print(sumValuesToANumberLinear(nums, total))

print(sumValuesToANumberHash(nums, total))
print(time.time() - start)
