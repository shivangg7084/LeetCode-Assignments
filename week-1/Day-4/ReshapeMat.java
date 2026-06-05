public class ReshapeMat {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int n = mat.length;
            int m = mat[0].length;

            if(n*m!=r*c) return mat;

            int[][] output = new int[r][c];
            int row_num = 0;
            int col_num = 0;

            for(int i = 0; i < n; i++){
                for(int j = 0; j<m ; j++){
                    output[row_num][col_num] = mat[i][j];
                    col_num++;
                    if(col_num == c){
                        col_num =0;
                        row_num++;
                    }
                }
            }
            return output;
        }
    }

