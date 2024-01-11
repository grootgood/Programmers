def solution(num_list):
    mul = 1
    sum = 0
    for i in num_list :
        mul *= i
        sum += i
    return 1 if mul < sum*sum else 0