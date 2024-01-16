def solution(order):
    answer = 0
    
    for menu in order :
        if "americano" in menu :
            answer += 4500
        elif "anything" in menu :
            answer += 4500
        else :
            answer += 5000
    return answer