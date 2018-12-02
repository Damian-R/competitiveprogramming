
count = 0
seen = {0: 1}
def addtosum():
    global count
    global seen
    input = file('./input/day1.txt')
    for line in input:
        count += int(line)
        if count in seen:
            return count
        else:
            seen[count] = 1

while True:
    if addtosum() is not None:
        print(count)
        break
