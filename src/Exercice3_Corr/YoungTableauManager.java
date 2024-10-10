package Exercice3_Corr;

public class YoungTableauManager implements Printable {
    private Matrix matrix;
    private YoungTableauLogic logic;

    public YoungTableauManager(int rowCount, int columnCount) {
        this.matrix = new Matrix(rowCount, columnCount);
        this.logic = new YoungTableauLogic(matrix);
    }

    public boolean insert(int value) {
        return logic.insert(value);
    }

    public int extractMin() {
        return logic.extractMin();
    }

    @Override
    public void printTable() {
        for (int row = 0; row < matrix.getRowCount(); row++) {
            for (int col = 0; col < matrix.getColumnCount(); col++) {
                int value = matrix.getValue(row, col);
                if (value == Integer.MAX_VALUE) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(value + "\t");
                }
            }
            System.out.println();
        }
    }
}
