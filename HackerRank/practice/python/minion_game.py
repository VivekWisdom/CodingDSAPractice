def minion_game(string):
    
    vowels = ['A', 'E', 'I', 'O', 'U']
    vowels_count = 0
    consonants_count = 0
    
    string_length = len(string)

    for i in range(string_length):
        if string[i] in vowels:
            vowels_count = vowels_count + 1 + (string_length-1-i)
            print("VOWELS", i, string[i], vowels_count, consonants_count)
        else:
            consonants_count = consonants_count + 1 + (string_length-1-i)
            print("CONSONANTS", i, string[i], vowels_count, consonants_count)
        
    if vowels_count > consonants_count:
        print("Kevin", vowels_count)
    elif consonants_count > vowels_count:
        print("Stuart", consonants_count)
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)