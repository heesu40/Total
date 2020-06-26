import heapq
h = [5,4,6,8]
k = 5
heapq.heapify(h)
L = len(h)
f = heapq.heappop(h)
for i in range(1, L):
    s = heapq.heappop(h)
    f = heapq.heappushpop(h, f + s * 2)
    print("f의 값 {}".format(f))
    if f >= k: print(i) 
print(-1)
