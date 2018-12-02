def isUnique(string):
    seen = {}
    for i, c in enumerate(string):
        if c not in seen:
            seen[c] = True
        else:
            return False
    return True

print(isUnique('abc'))
        