# Question: https://leetcode.com/problems/set-matrix-zeroes/

class SetMatrixZero:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row_size = len(matrix)
        col_size = len(matrix[0])

#         Naive Way:

#         indexes = []
#         for row in range(row_size):
#             for col in range(col_size):
#                 if matrix[row][col]==0:
#                     indexes.append((row,col))
        
#         for x in indexes:
#             r = x[0]
#             c = x[1]
            
#             for i in range(row_size):
#                 matrix[i][c]=0
#             for i in range(col_size):
#                 matrix[r][i]=0
        
        is_col_flag = False
        for i in range(row_size):
            if matrix[i][0] == 0:
                is_col_flag = True
            for j in range(1, col_size):
                if matrix[i][j]==0:
                    matrix[i][0]=0
                    matrix[0][j]=0
                    
        for i in range(1, row_size):
            for j in range(1, col_size):
                if not matrix[i][0] or not matrix[0][j]:
                    matrix[i][j]=0
                    
        if matrix[0][0] == 0:
            for i in range(col_size):
                matrix[0][i]=0
        
        if is_col_flag:
            for i in range(row_size):
                matrix[i][0]=0