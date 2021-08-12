class NumMatrix {
    public int[][] m;

    public NumMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        m = new int[R + 1][C + 1];

        for (int r = 1; r <= R; r++) {
            for (int c = 1; c <= C; c++) {
                m[r][c] = m[r - 1][c] + m[r][c - 1] + matrix[r - 1][c - 1] - m[r - 1][c - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return m[row2 + 1][col2 + 1] - m[row1][col2 + 1] - m[row2 + 1][col1] + m[row1][col1];
    }
}
