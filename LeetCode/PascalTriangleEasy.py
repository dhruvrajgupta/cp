#Question : https://leetcode.com/problems/pascals-triangle/

class PascalTriangleEasy:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = [None]*numRows
        for i in range(numRows):
            #print("i : "+str(i))
            row, mid = [1] * (i+1), (i >> 1) + 1
            #print(mid)
            for j in range(1, mid):
                #print("enter")
                val = ans[i-1][j-1] + ans[i-1][j]
                row[j], row[len(row)-j-1] = val, val
            ans[i] = row
        return ans