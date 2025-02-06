
def two_sum(nums, target):
    # Get the length of the input list
    n = len(nums)
    
    # Iterate over each element in the list except the last one
    for i in range(n - 1):  # Stop one element before the end
        # For each element, iterate over the subsequent elements
        for j in range(i + 1, n):
            # Check if the sum of the current pair of elements equals the target
            if nums[i] + nums[j] == target:
                # If a pair is found, return their indices as a list
                return [i, j]
    
    # If no pair is found that sums to the target, return an empty list
    return []  # Return an empty list if no solution is found