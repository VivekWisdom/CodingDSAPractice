class Solution:
    def findComplement(self, num: int) -> int:
        # conver to binary first
        binary = []

        while num > 0:
            remainder = num % 2
            binary.append(remainder)
            num = num // 2
        
        # reverse the binary
        binary = binary[::-1]

        # complement the binary
        complement = []
        for i in binary:
            if i == 0:
                complement.append(1)
            else:
                complement.append(0)
        
        # convert the complement to decimal
        decimal = 0
        for i in range(len(complement)):
            decimal += complement[i] * (2 ** (len(complement) - i - 1))
        
        return decimal


if __name__ == '__main__':
    num = 10
    solution = Solution()
    print(solution.findComplement(num))