def solution(myString, pat):
    answer = 0
    string = list(myString)
    pat_length = len(pat)
    
    for i in range(len(string) - pat_length + 1):
        if ''.join(string[i:i+pat_length]) == pat:
            answer += 1
    
    return answer