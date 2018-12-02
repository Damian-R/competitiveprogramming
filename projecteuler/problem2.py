mem = {}
summ = 0

def fib(n):
    global summ
    if n == 0:
        mem[n] = 0
        return 0
    if n == 1 or n == 2:
        mem[n] = 1
        return 1
    if n in mem:
        return mem[n]
    val = fib(n-1) + fib(n-2)
    if val % 2 == 0 and val <= 4000000:
        summ += val
    mem[n] = val
    return val

fib(36)
print(summ)