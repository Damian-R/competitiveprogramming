def one_away(one, two):
    if one == two: return True
    diff = 0
    if len(one) == len(two):
        for i, e in enumerate(one):
            if e != two[i]:
                if diff == 1: return False
                diff = 1
    elif len(one) != len(two):
        longer = one if len(one) > len(two) else two
        shorter = one if len(one) < len(two) else two
        for i, e in enumerate(longer):
            if i == len(shorter) and diff == 0: return True
            if e != shorter[i - diff]:
                if diff == 1: return False
                diff = 1
    return True

print one_away('pale', 'pales')
