"""Given an array of integers nums, return how many of them contain an even number of digits.

Returns:
int: return the count of numbers with even digits

@Author: Vivek Wisdom
@Created: 2024-09-08    
"""

from typing import List


class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for num in nums:
            str_list = list(str(num))
            if len(str_list) % 2 == 0:
                count+=1
            else:
                continue
        
        return count
        


if __name__ == "__main__":

    solution = Solution()
    k = solution.findNumbers([12,345,2,6,7896]) # 2
    print(k)
