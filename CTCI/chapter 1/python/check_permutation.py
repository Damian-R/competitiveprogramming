def check_permutation(a, b):
    dict_a = {}
    dict_b = {}

    for i, c in enumerate(a):
        if c not in dict_a:
            dict_a[c] = 1
        else:
            dict_a[c] += 1
    for i, c in enumerate(b):
        if c not in dict_b:
            dict_b[c] = 1
        else:
            dict_b[c] += 1
    return dict_a == dict_b

print(check_permutation('abc', 'bca'))
