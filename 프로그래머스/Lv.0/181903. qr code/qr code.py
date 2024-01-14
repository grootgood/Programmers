def solution(q, r, code):
    arr = list(code)
    tmp = []
    for i, val in enumerate(arr):
        if i % q == r :
            tmp.append(val)
    answer = ''.join(tmp)
    return answer