import re

def solution(myStr):
    answer = list(filter(None, re.split(r'a|b|c', myStr)))
    if len(answer) == 0:
        answer.append("EMPTY")
        
    return answer