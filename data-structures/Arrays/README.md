# Arrays - Practice Problems

## Questions

### Question 1:
Given an integer array `nums`, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
```
Input: nums = [1, 2, 3, 1]  
Output: true
```

**Example 2:**
```
Input: nums = [1, 2, 3, 4]  
Output: false
```

**Example 3:**
```
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]  
Output: true
```

**Constraints:**
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9

---

### Question 2:
There is an integer array `nums` sorted in ascending order (with distinct values). Prior to being passed to your function, `nums` is possibly rotated at an unknown pivot index `k` (1 <= k < nums.length). Return the index of `target` if it is in `nums`, or -1 if it is not in `nums`.

**Example 1:**
```
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0  
Output: 4
```

**Example 2:**
```
Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3  
Output: -1
```

**Example 3:**
```
Input: nums = [1], target = 0  
Output: -1
```

**Constraints:**
- 1 <= nums.length <= 5000
- -10^4 <= nums[i] <= 10^4
- All values of `nums` are unique.

---

### Question 3:
You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day. Return the maximum profit you can achieve from this transaction. If no profit can be made, return 0.

**Example 1:**
```
Input: prices = [7, 1, 5, 3, 6, 4]  
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
```

**Example 2:**
```
Input: prices = [7, 6, 4, 3, 1]  
Output: 0
Explanation: In this case, no transactions are done, and the max profit = 0.
```

**Constraints:**
- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

---

### Question 4:
Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

**Example 1:**
```
Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]  
Output: 6
```

**Example 2:**
```
Input: height = [4, 2, 0, 3, 2, 5]  
Output: 9
```

**Constraints:**
- 1 <= height.length <= 2 * 10^4
- 0 <= height[i] <= 10^5

---

### Question 5:
Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`. The solution set must not contain duplicate triplets.

**Example 1:**
```
Input: nums = [-1, 0, 1, 2, -1, -4]  
Output: [[-1, -1, 2], [-1, 0, 1]]
```

**Example 2:**
```
Input: nums = []  
Output: []
```

**Example 3:**
```
Input: nums = [0]  
Output: []
```

**Constraints:**
- 0 <= nums.length <= 3000
- -10^5 <= nums[i] <= 10^5

---

## Solutions

### Solution to Question 1:
```java
public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < nums.length; i++) {
        if(set.contains(nums[i])) {
            return true;
        } else {
            set.add(nums[i]);
        }
    }
    return false;
}
```

### Solution to Question 2:
```java
public int search(int[] nums, int target) {
    int min = minSearch(nums);
    if(nums[min] <= target && target <= nums[nums.length - 1]) {
        return search(nums, min, nums.length - 1, target);
    } else {
        return search(nums, 0, min, target);
    }
}

public int search(int[] nums, int left, int right, int target) {
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
}

public int minSearch(int[] nums) {
    int left = 0, right = nums.length - 1;
    while(left < right) {
        int mid = left + (right - left) / 2;
        if(nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}
```

### Solution to Question 3:
```java
public int maxProfit(int[] prices) {
    int buy = prices[0];
    int profit = 0;
    for(int i = 1; i < prices.length; i++) {
        if(buy < prices[i]) {
            profit = Math.max(profit, prices[i] - buy);
        } else {
            buy = prices[i];
        }
    }
    return profit;
}
```

### Solution to Question 4:
```java
public int trap(int[] height) {
    int n = height.length;
    int res = 0, l = 0, r = n - 1;
    int rMax = height[r], lMax = height[l];
    while(l < r) {
        if(lMax < rMax) {
            l++;
            lMax = Math.max(lMax, height[l]);
            res += lMax - height[l];
        } else {
            r--;
            rMax = Math.max(rMax, height[r]);
            res += rMax - height[r];
        }
    }
    return res;
}
```

### Solution to Question 5:
```java
public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0; i < nums.length - 2; i++) {
        if(i > 0 && nums[i] == nums[i - 1]) continue;
        int j = i + 1, k = nums.length - 1;
        while(j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0) {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                while(j < k && nums[j] == nums[j + 1]) j++;
                while(j < k && nums[k] == nums[k - 1]) k--;
                j++; k--;
            } else if(sum < 0) {
                j++;
            } else {
                k--;
            }
        }
    }
    return result;
}
```

--- 
Happy coding!