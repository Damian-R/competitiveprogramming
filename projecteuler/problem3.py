import math
def is_prime(n):
    for i in range(2, math.ceil(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def is_factor(n, x):
    return x % n == 0

root = math.ceil(math.sqrt(600851475143))

for i in range(root):
    if is_prime(root - i) and is_factor(root - i, 600851475143):
        print(root - i)
        break