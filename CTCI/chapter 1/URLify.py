def URLify(url, length):
    add_to_index = 0
    trailing = True
    for i in range(len(url) - 1, 0, -1):
        if trailing:
            if url[i] == ' ':
                add_to_index += 1
            else:
                trailing = False
                url[i + add_to_index] = url[i]
                url[i] = ' '
        else:
            if url[i] == ' ':
                url[i + add_to_index] = '0'
                url[i-1 + add_to_index] = '2'
                url[i-2 + add_to_index] = '%'
                i -= add_to_index + 1
                add_to_index -= 2
            else:
                if add_to_index == 0:
                    return url
                url[i + add_to_index] = url[i]
                url[i] = ' '

url = 'Mr John Smith    '
length = 13
print URLify(list(url), length)
