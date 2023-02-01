word = input("Please enter your string: ")
output = ""
length = len(word)

for k in range(length):
    counter = 0
    while k < length-1:
        if word[k + 1] == word[k]:
            counter += counter
        k += k

    if (counter > 9):
        output += "/" + (counter + 1) + word[k]
    elif (counter > 4):
        output += "/0" + (counter + 1) + word[k]
    else:
        for i in counter:
            output += word[k]

print(output)