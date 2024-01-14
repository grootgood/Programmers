def solution(my_string, s, e):
    arr = list(my_string)
    reversed_str = arr[s:e+1][::-1]
    arr[s:e+1] = reversed_str
    answer = ''.join(arr)
    return answer