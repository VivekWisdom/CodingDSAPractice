# a = [2,4,3,6,5,7]
# result = [(2,4), (4,3).....]



def returnImmediateTuple(nums):
    nums_length = len(nums)
    return [(nums[j], nums[i]) for j, i in enumerate(range(1, nums_length))]
    

print(returnImmediateTuple([2, 3, 4, 5, 6, 7]))
