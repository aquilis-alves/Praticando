my_list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25]

item = int(input('write number in of 0 till 25: '))

first_number = 0
last_number = len(my_list) - 1

while first_number <= last_number:
    middle = (first_number + last_number) // 2
    kick = my_list[middle]
    
    if item == kick:
        print(f'Your number to be in {middle} position')
        break
    
    elif item < kick:
        last_number = middle - 1
    
    else:
        first_number = middle + 1
