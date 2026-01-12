import sys

n, m=map(int, sys.stdin.readline().split())
box = [i for i in range(1,n+1)]

for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    temp = box[i-1]
    box[i-1]=box[j-1]
    box[j-1]=temp

for b in box:
  print(b, end=' ')