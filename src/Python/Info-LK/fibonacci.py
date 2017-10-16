f= lambda x: 1 if x <= 2 else f(x - 1) + f(x - 2)


def fibR(n):
    if n<3:
        return 1
    return fibR(n - 1) + fibR(n - 2)

def fibI(n,i1=1,i2=1):
   c=1
   set=[i1]
   while(c<n):
     t=i1
     i1=i2
     i2=t+i1
     c+=1 
     set.append(i1)
   return set

n=int(input("n:"))
i1=input("iterative starting i1: ('d' for default params)")

if(i1=='d'):
   print(fibI(n))
else:
   i1=int(i1)
   i2=int(input("iterative starting i2: "))
   print(fibI(n,i1,i2))

print("recursive:"+str(fibR(n)))
print("recursive lambda:"+str(f(n)))
