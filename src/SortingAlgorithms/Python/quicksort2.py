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

    def sort(self, low, high):
        i, j = low, high
        # Get the pivot element from the middle of the list
        pivot = arr[int(low + (high - low) / 2)]

        # Divide into two lists
        while (i <= j):
            while (arr[i] < pivot):
                i += 1

            while (arr[j] > pivot):
                j -= 1

            if (i <= j):
                self.__swap(i, j)
                i += 1
                j -= 1

        # Recursion
        if (low < j):
            self.sort(low, j)

        if (i < high):
            self.sort(i, high)


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
    arr = ag.generate(upper=1000, size=10000)
    # sys.setrecursionlimit(1000000000)
    sortAlgo = QuickSort(arr)
    sortAlgo.sort(0, len(arr) - 1)
    # sortAlgo.out()
    # sortAlgo2= OtherQuicksort()
    # sortAlgo2.quickSort(arr)
    print(arr)
