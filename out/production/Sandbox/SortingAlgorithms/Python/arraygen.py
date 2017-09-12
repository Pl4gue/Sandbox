from random import randint


class ArrayGenerator():
    def generate(lower=0, upper=1000, size=100):
        arr = []
        for i in range(0, size):
            arr.append(randint(lower, upper))
        return arr
