def solution(intStrs, k, s, l):
    answer = []
    
    for arr in intStrs :
        part = arr[s:s+l]
        num = int(part)
        if num > k :
            answer.append(num)
    return answer