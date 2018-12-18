def string_compression(s):
    res = ''
    streak = 1
    for i, e in enumerate(s[1:]):
        if e == s[i]:
            streak += 1
        else:
            res += s[i]
            res += str(streak)
            streak = 1
    res += s[len(s) - 1]
    res += str(streak)
    return res if len(res) < len(s) else s
print string_compression('aabcccccaaa')
