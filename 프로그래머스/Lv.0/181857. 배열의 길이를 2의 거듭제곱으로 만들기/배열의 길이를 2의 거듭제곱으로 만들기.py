def solution(arr):
    answer = []
    n = 0
    add = 0
    
    if len(arr) == 1 :
        answer = arr
    else :
        while n>=0:
            if 2**n <= len(arr) <= 2**(n+1) :
                add = 2**(n+1) - len(arr)
                break
            n+=1
        if add > 0:
            arr.extend([0]*add)

        answer = arr
    return answer