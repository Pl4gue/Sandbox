def hanoi(start, ablage, ziel, n):
    if(n > 1):
    	hanoi(start[1]
    		, ziel[1]
    		, ablage[1], n - 1)
    bewege(start, ziel)
    if(n > 1):
    	hanoi(ablage[1]
    		, start[1]
    		, ziel[1], n - 1)


def bewege(von, nach):
    a = von[1][-1]
    del von[1][-1]
    print("Moving from " + von[0] + " to " + nach[0])
    nach[1].append(a)


start = ["A", (list([5, 4, 3, 2, 1]))]
ablage = ["B", (list([]))]
ziel = ["C", (list([]))]
hanoi(start, ablage, ziel, 5)
print(str(start) + "\n" + str(ziel))
