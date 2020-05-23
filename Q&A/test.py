import numpy as np
from collections import Counter

a = [[1,2],[2,3]]
b = list(np.ravel(a))
dic = {}
count = Counter(b)
for i,y in count.items():
    dic[i]=y
c = dic
answer = 1987+1
    
count = False
while True:
    answer = int(answer)
    a = list(set(list(str(answer))))
    print(a)
    if len(a) == 4:
        answer = "".join(a)
        count = True
        break
    else :
        answer += 1
print(answer)

