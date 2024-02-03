my_list = [2, 5]

def sum_elements (list):
    if len(list) == 0:
        return 0
    
    else:
        return list.pop(0) + sum_elements(list)
    
print(sum_elements(my_list))