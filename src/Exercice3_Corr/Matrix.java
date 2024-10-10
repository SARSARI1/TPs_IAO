package Exercice3_Corr;

public class Matrix {
    private static final int INF = Integer.MAX_VALUE;
    private int[][] matrix;
    private int rowCount;
    private int columnCount;

    public Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.matrix = new int[rowCount][columnCount];

        // Initialize matrix with INF values
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                matrix[row][col] = INF;
            }
        }
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }

    public void setValue(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public boolean isFull() {
        return matrix[rowCount - 1][columnCount - 1] != INF;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }
}
