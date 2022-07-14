doors = [False] * 101


for outIndex in range(1, 101):
    for index in range(outIndex, 101, outIndex):
        doors[index] = not doors[index]

for index in range(1, 101):
    if doors[index]:
       print(str(index) + ', ')