def solution(myString, pat):
    answer = ''
    num = myString.rfind(pat)
    answer = myString[:num] + pat
    return answer