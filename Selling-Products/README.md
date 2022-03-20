# Selling Products
A salesperson must sell n items in a bag with random IDs. The salesperson can remove as many as mitems from the bag. Determine the minimum number of different IDs the final bag can contain after performing, at most, m deletions.

## Example
n = 6
ids = [1, 1, 1, 2, 3, 2]
m = 2

Two possible actions that give the minimum 2 different IDs:
1. Remove 2 items with ID = 2 and the final bag will contain item ids' = [1, 1, 1, 3]
2. Remove 1 item with ID = 2 and 1 item with ID = 3 and the final bag will contain item ids' = [1, 1, 1, 2]
The minimum number of distinct IDs is 2.

## Sample Case 0
 ### Sample Input

| STDIN | Function |
| --- | --- |
| 4 | ids[] size n = 4 |
| 1 | ids = [1,1,5,5] |
| 1 |  |
| 5 |  |
| 5 |  |
| 2 | m = 2 |

### Sample Output
Two possible actions that give 1 as the minimum number of different IDs:
1. Remove 2 items with ID = 1 and the final bag will contain item ids' = [5, 5]
2. Remove 2 items with ID = 5 and the final bag will contain item ids' = [1,1]