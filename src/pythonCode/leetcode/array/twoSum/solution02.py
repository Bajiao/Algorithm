def two_sum(nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []  # Return an empty list if no solution is found

def two_sum(nums, target):
    n = len(nums)
    for i in range(n - 1):  # Stop one element before the end
        for j in range(i + 1, n):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []  # Return an empty list if no solution is found