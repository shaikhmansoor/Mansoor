s = "Hello <<UserName>>, How are you?"
while True:
	n = input("Enter your name")+","
	if len(n)<4:print("Minimum 3 characters required!!")
	else:break
s = s.split()
for i in  range(len(s)):
	if s[i] == "<<UserName>>,":
		s[i] = n
print(" ".join(s))

