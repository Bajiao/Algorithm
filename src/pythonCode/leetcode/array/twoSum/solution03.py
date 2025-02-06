def two_sum(nums, target):
    # Create a dictionary to store the complement and its index
    num_map = {}
    
    # Iterate over each element in the list
    for index, num in enumerate(nums):
        # Calculate the complement of the current number to reduce the usage of memory
        complement = target - num
        
        # Check if the complement is already in the dictionary
        if complement in num_map:
            # If found, return the indices of the complement and the current number
            return [num_map[complement], index]
        
        # Store the current number and its index in the dictionary
        num_map[num] = index
    
    # If no pair is found that sums to the target, return an empty list
    return []