def palindrome_permutation(string):
    string = string.lower().replace(' ','')
    seen = {}
    ans = True
    numodd = 0
    for i, c in enumerate(string):
        if c not in seen:
            seen[c] = 1
            numodd += 1
        else:
            seen[c] += 1
            numodd = numodd - 1 if seen[c] % 2 == 0 else numodd + 1
    return numodd <= 1

print palindrome_permutation('Tact Coa')
