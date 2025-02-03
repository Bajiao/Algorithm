# Contents of src/pythonCode/leetcode/array/twoSum/demo.py

from pythonCode.leetcode.array.twoSum.solution01 import two_sum

def main():
    # Test cases
    test_cases = [
        ([2, 7, 11, 15], 9),  # Expected output: [0, 1]
        ([3, 2, 4], 6),       # Expected output: [1, 2]
        ([3, 3], 6)           # Expected output: [0, 1]
    ]

    for nums, target in test_cases:
        result = two_sum(nums, target)
        print(f"two_sum({nums}, {target}) = {result}")

if __name__ == "__main__":
    main()