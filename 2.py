import random
n = int(input("Enter no of time to toss a coin"))
h=t=0
for i in range(n):
	r = random.random()
	if r<0.5:t+=1
	else:h+=1
print("Tails = ",t*100/(t+h),"Heads = ",h*100/(t+h))
