# Diagonals - 1
# Below - 1
# Above diagonal - 0

# NXN Matrix


#  3 * 3

# [1, 0, 0]
# [1, 1, 0]
# [1, 1, 1]

import numpy as np

def plot_ones_zeros(n, m):
    #  number of rows n
    # number of columns m

    output = np.zeros((n, m))
    for i in range(n):
        for j in range(m):
            output[i][j] = '1' if i == j or i >= j else '0'
    return output

print(plot_ones_zeros(6, 6))