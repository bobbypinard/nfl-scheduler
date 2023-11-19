import random

ray = [1, 2, 3, 4]
shuffle = ray
placeholder =  0

print(ray)

for i in range(len(ray) -1, -1, -1):
    placeholder = shuffle[i]
    rand = random.randint(0, i)
    shuffle[i] = shuffle[rand]
    shuffle[rand] = placeholder
    print(shuffle)
