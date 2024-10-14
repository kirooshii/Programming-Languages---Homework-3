def find_local_maxima(arr):
    size = len(arr)

    if size < 2:
        return []

    maxima = []

    # Check first element
    if arr[0] > arr[1]:
        maxima.append(arr[0])

    # Check middle elements
    for i in range(1, size - 1):
        if arr[i] > arr[i - 1] and arr[i] > arr[i + 1]:
            maxima.append(arr[i])

    # Check last element
    if arr[size - 1] > arr[size - 2]:
        maxima.append(arr[size - 1])

    return maxima

arr = [2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8]
print(find_local_maxima(arr))
