def solution(date1, date2):
    if int("".join(map(str, date1))) >= int("".join(map(str, date2))) :
        answer = 0
    else :
        answer = 1
    return answer