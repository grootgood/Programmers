def solution(my_string):
    answer = [0] * 52
    alp = list(my_string)
    
    for i in alp :
        if 'Z' < i :
            answer[ord(i) - 71] += 1
        else :
            answer[ord(i) - 65] += 1
    return answer