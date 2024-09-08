"""
Find all even numbers possible from a list of digits

Problem Link: https://leetcode.com/problems/finding-3-digit-even-numbers/

Returns:
List[int]: return the list of even numbers

@Author: Vivek Wisdom
@Created: 2024-09-08    

"""

from typing import List



class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        res=[]
        for i in range(100,1000,2):
            #check all the numbers  
            j=i
            flag=True
            temp=digits.copy()
            while j!=0: # breaking the number into  it's digits
                x=j%10
                j=j//10
                
                if x not in temp:
                    flag=False
                    break
                if x in temp:
                    temp.remove(x)
                print(x, j, temp, res)
            if flag:
                res.append(i)
        res.sort()
        return res
# class Solution:
#     def findEvenNumbers(self, digits: List[int]) -> List[int]:
#         S = set()
#         N = len(digits)
#         for i in range(N): 
#             for j in range(N): 
#                 for k in range(N): 
#                 # check if the indexes are not 
#                 # same 
#                     if (i!=j and j!=k and i!=k): 
#                         num = int("".join([str(digits[i]), str(digits[j]), str(digits[k])]))
#                         # print(num, type(num), len(list(str(num))))
#                         if len(list(str(num))) == 3:
#                             S.add(num)
#         # print(S)
#         ret_list = []                
#         for val in S:
#             if val % 2 == 0:
#                 ret_list.append(val)
        
#         return sorted(ret_list, reverse=False)



if __name__ == "__main__":

    solution = Solution()
    k = solution.findEvenNumbers([2, 1, 3, 0]) # [102, 120, 130, 132, 210, 230, 302, 310, 312, 320]
    print(k)