def solution(arr):
    
    check_idx = []
    for i,val in enumerate(arr) :
        if val == 2:
            check_idx.append(i)
    
    if check_idx :
        min_idx = min(check_idx)
        max_idx = max(check_idx)

        answer = arr[min_idx : max_idx+1]
    else :
        answer = [-1]
    return answer