from arraygen import ArrayGenerator as ag
import sys

class QuickSort():
    arr = []

    def __init__(self, arr):
        self.arr = arr

    def __swap(self, i, j):
        a = self.arr[i]
        b = self.arr[j]
        self.arr[i] = b
        self.arr[j] = a

    def sort(self, l, r):
        pivot = int((r - l) / 2 + l)
        low, high = l, r
        while(l <= r):
            while(self.arr[l] < self.arr[pivot]):
                l += 1
            while(self.arr[r] > self.arr[pivot]):
                r -= 1
            if(l <= r):
                self.__swap(l, r)
                l += 1
                r -= 1
        if(low < r):
            self.sort(low, r)
        if(l < high):
            self.sort(l, high)


class OtherQuicksort():
    def quickSort(self, alist):
        self.quickSortHelper(alist, 0, len(alist) - 1)

    def quickSortHelper(self, alist, first, last):
        if first < last:

            splitpoint = self.partition(alist, first, last)

            self.quickSortHelper(alist, first, splitpoint - 1)
            self.quickSortHelper(alist, splitpoint + 1, last)

    def partition(self, alist, first, last):
        pivotvalue = alist[first]

        leftmark = first + 1
        rightmark = last

        done = False
        while not done:

            while leftmark <= rightmark and alist[leftmark] <= pivotvalue:
                leftmark = leftmark + 1

            while alist[rightmark] >= pivotvalue and rightmark >= leftmark:
                rightmark = rightmark - 1

            if rightmark < leftmark:
                done = True
            else:
                temp = alist[leftmark]
                alist[leftmark] = alist[rightmark]
                alist[rightmark] = temp

        temp = alist[first]
        alist[first] = alist[rightmark]
        alist[rightmark] = temp

        return rightmark


if __name__ == '__main__':
    arr = ag.generate(upper=1e9, size=100000)
    sys.setrecursionlimit(1000000000)
    sortAlgo = QuickSort(arr)
    sortAlgo.sort(l=0, r=len(arr) - 1)
    print(arr)
    # sortAlgo.out()
    # sortAlgo2= OtherQuicksort()
    # sortAlgo2.quickSort(arr)
    # print(arr)
