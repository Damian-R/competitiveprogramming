def part1():
    totaltwice = 0
    totalthrice = 0
    input = file('./input/day2.txt')
    for line in input:
        seen = {}
        twice = 0
        thrice = 0
        for i, e in enumerate(line):
            if e not in seen:
                seen[e] = 1
            elif seen[e] == 1:
                twice += 1
                seen[e] += 1
            elif seen[e] == 2:
                thrice += 1
                twice -= 1
                seen[e] += 1
            elif seen[e] == 3:
                thrice -= 1
        if twice >= 1:
            totaltwice += 1
        if thrice >= 1:
            totalthrice += 1
    print(totalthrice * totaltwice)

def part2():
    boxes = file('./input/day2.txt').readlines()
    for box in boxes:
        for other in boxes:
            diff = 0
            index = None
            breakout = False
            for i, c in enumerate(box):
                if c is not other[i]:
                    diff += 1
                    index = i
                if diff == 2:
                    breakout = True
                    break
            if diff == 1:
                print(box[:index] + box[index+1:])

part1()
part2()