# LeetCode 274: H-Index

##  Problem Description
The **H-Index** is a metric used to measure both the productivity and citation impact of a researcher. 

A researcher has an index `h` if `h` of their `n` papers have at least `h` citations each, and the other `n − h` papers have no more than `h` citations each.

**Example:**
*   **Input:** `citations = [3, 0, 6, 1, 5]`
*   **Output:** `3`
*   **Explanation:** The researcher has 5 papers. 3 of those papers have at least 3 citations (specifically 3, 5, and 6). The remaining 2 papers have fewer than 3 citations.

---

##  My Approach: Sorting & Greedy Scan
To solve this, I used a sorting-based strategy. The core idea is that once the citations are sorted, we can easily count how many papers meet the threshold as we iterate.

### Logic Steps:
1.  **Sort the Array:** First, I sort the `citations` array in ascending order.
2.  **Iterate Backwards:** Since we want the *maximum* value of `h`, I start from the end of the array (the papers with the most citations).
3.  **Track the Count:** I use a variable `k` (starting at 1) to represent the potential h-index we are checking.
4.  **The Condition:** For every paper, if the number of citations is greater than or equal to our current count `k`, it means we have at least `k` papers with `k` citations. We increment `k` and keep moving.
5.  **Return:** Once the condition fails, we return `k - 1` (because the last increment was the one that broke the logic).

### Complexity Analysis
*   **Time Complexity:** $O(n \log n)$ due to the `Arrays.sort()` function.
*   **Space Complexity:** $O(1)$ (or $O(\log n)$ depending on the sorting implementation's recursion stack), as we are modifying the array in-place.
