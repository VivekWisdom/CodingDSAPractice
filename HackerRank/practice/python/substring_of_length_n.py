def substrings(s, n):
    return len({s[i:i+n] for i in range(len(s)-n+1)})
    # S = set()
    # for i in range(len(s)-n+1):
    #     S.add(s[i:i+n])
    #     print(i, s[i:i+n], S)
    # return len(S)
if __name__ == '__main__':
    s = input("Enter a string: ")
    n = int(input("Enter the length of substrings: "))
    print(substrings(s, n))