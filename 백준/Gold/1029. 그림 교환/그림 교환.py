from functools import*

n = int(input())
prices = [[int(x) for x in input()] for _ in range(n)]

answer = 0

# cur,p,s 가 같다면 캐싱된 값을 사용한다.
@cache
def dfs(cur, p, s):
    global answer
    answer = max(answer,s.bit_count())
    for i in range(n):
        # 소유했던 사람 목록에 없고, 가격이 더 크다면
        if (1<<i)|s != s and p<=prices[cur][i]:
            # 가격을 업데이트하고 소유했던 사람 목록에 추가한다.
            dfs(i, prices[cur][i],s | (1<<i))

dfs(0,0,1)

print(answer)