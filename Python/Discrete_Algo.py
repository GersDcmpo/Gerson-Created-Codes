## Getting the elements to be sorted
def inputValue(size):
    for x in range(size):
        value = int(input("Enter elements: "))
        n.append(value)

## Sorting elements from n array
def insertionSort(n):
    for x in range(size):
        key = n[x]

        y = x - 1

        while y >= 0 and key < n[y]:
            n[y + 1] = n[y]
            y -= 1
        n[y + 1] = key

## Initialization of elements in array
n = []
z = []

## Asks for how many elements
size = int(input("Enter how many elements you want to sort: "))
inputValue(size)

## Before sorting the elements
print("Array: ", n)
insertionSort(n)

## After sorting the elements
for x in range(size):
    z.append(n[x])
print("Sorted Array: ", z)
