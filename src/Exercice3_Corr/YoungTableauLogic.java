package Exercice3_Corr;

public class YoungTableauLogic implements Insertable, Balanced {
    private Matrix matrix;

    public YoungTableauLogic(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean insert(int value) {
        if (matrix.isFull()) {
            System.out.println("Young tableau is full.");
            return false;
        }

        int rowCount = matrix.getRowCount();
        int columnCount = matrix.getColumnCount();

        matrix.setValue(rowCount - 1, columnCount - 1, value);

        int currentRow = rowCount - 1;
        int currentCol = columnCount - 1;

        while (currentRow > 0 || currentCol > 0) {
            int topNeighbor = (currentRow > 0) ? matrix.getValue(currentRow - 1, currentCol) : Integer.MAX_VALUE;
            int leftNeighbor = (currentCol > 0) ? matrix.getValue(currentRow, currentCol - 1) : Integer.MAX_VALUE;

            if (value >= topNeighbor && value >= leftNeighbor) {
                break; // Value is in the correct position
            } else if (topNeighbor < leftNeighbor) {
                matrix.setValue(currentRow, currentCol, topNeighbor);
                currentRow--;
            } else {
                matrix.setValue(currentRow, currentCol, leftNeighbor);
                currentCol--;
            }
        }

        matrix.setValue(currentRow, currentCol, value);
        return true;
    }

    @Override
    public int extractMin() {
        if (matrix.getValue(0, 0) == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        int minValue = matrix.getValue(0, 0);
        balanceTableau(0, 0);
        return minValue;
    }

    @Override
    public void balanceTableau(int row, int col) {
        int belowNeighbor = (row + 1 < matrix.getRowCount()) ? matrix.getValue(row + 1, col) : Integer.MAX_VALUE;
        int rightNeighbor = (col + 1 < matrix.getColumnCount()) ? matrix.getValue(row, col + 1) : Integer.MAX_VALUE;

        if (belowNeighbor == Integer.MAX_VALUE && rightNeighbor == Integer.MAX_VALUE) {
            matrix.setValue(row, col, Integer.MAX_VALUE);
            return;
        }

        if (belowNeighbor < rightNeighbor) {
            matrix.setValue(row, col, belowNeighbor);
            balanceTableau(row + 1, col);
        } else {
            matrix.setValue(row, col, rightNeighbor);
            balanceTableau(row, col + 1);
        }
    }
}
