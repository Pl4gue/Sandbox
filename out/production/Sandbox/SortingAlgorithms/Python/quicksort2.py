from arraygen import ArrayGenerator as ag
import sys
arr=[]

def swap(i,j):
    t1=arr[i]
    t2=arr[j]
    arr[i]=t2
    arr[j]=t1

def sort(i,j):
    low,high=i,j
    pivot=int((j-i)/2 + i)
    while(i<=j):
        while(arr[i]<arr[pivot]):
            i+=1	   
        while(arr[j]>arr[pivot]):
            j-=1
        if(i<=j):
            swap(i,j)
            i+=1
            j-=1
    if(low<j):
        sort(low,j)
    if(i<high):
        sort(i,high)


if(__name__=="__main__"):
    arr=ag.generate(upper=100,size=100)
    sort(0,len(arr)-1)
    print(arr)
