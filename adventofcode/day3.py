import re
GRID_SIZE = 1000
grid = [[0] * GRID_SIZE for i in range(GRID_SIZE)]
ans = 0

def add_to_grid(left, top, width, height):
    global grid
    global ans
    for i in range(height):
        for j in range(width):
            prev = grid[top + i][left + j]
            if prev == 1:
                ans += 1
            grid[top + i][left + j] += 1

def check_if_overlaps(left, top, width, height):
    global grid
    for i in range(height):
        for j in range(width):
            if grid[top + i][left + j] != 1:
                return True
    return False

def part1():
    input = file('./input/day3.txt')
    for line in input:
        reg = re.search('#(\d+) @ (\d+),(\d+): (\d+)x(\d+)', line)
        left = int(reg.group(2))
        top = int(reg.group(3))
        width = int(reg.group(4))
        height = int(reg.group(5))
        add_to_grid(left, top, width, height)

def part2():
    # not pretty but it works :D
    input = file('./input/day3.txt')
    for line in input:
        reg = re.search('#(\d+) @ (\d+),(\d+): (\d+)x(\d+)', line)
        claim = int(reg.group(1))
        left = int(reg.group(2))
        top = int(reg.group(3))
        width = int(reg.group(4))
        height = int(reg.group(5))
        if check_if_overlaps(left, top, width, height) is False:
            return claim

part1()
non_overlap = part2()
print(ans)
print(non_overlap)
