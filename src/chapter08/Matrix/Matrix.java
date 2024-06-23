/**
* Simple progema to simulate a math matrix
* Author: Philippe Matias
*/


/*-----------------------------*/
public class Matrix
{
    /*-----------------------------*/
    private int rows;
    private int columns;
    private int[][] data = null;

    /*-----------------------------*/
    public Matrix(int rows, int columns)
    {
        if (rows <= 0 || columns <= 0)
            throw new IllegalArgumentException("dimension of matrix is illegal");

        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    /*-----------------------------*/
    public void setRow(int row, int... values)
    {
        if (row <= 0 || row > this.rows)
            throw new IllegalArgumentException("invalid index of row");

        if (values.length <= 0 || values.length > this.columns)
            throw new IllegalArgumentException("invalid number of values to the row");

        int c = 0;
        for (int i : values) {
            this.data[row-1][c++] = i;
        }
    }

    /*-----------------------------*/
    public int at(int row, int column)
    {
        if (rows <= 0 || columns <= 0 || rows > this.rows || columns > this.columns)
            throw new IllegalArgumentException("matrix index out of range");

        return this.data[row-1][column-1];
    }

    /*-----------------------------*/
    public int getNumRows() { return this.rows; }
    public int getNumClumns() { return this.columns; }
    public boolean isSquare() { return (this.columns == this.rows); }

    /*-----------------------------*/
    public Matrix sum(Matrix m)
    {
        for (int i = 0; i < this.rows; ++i) {
            for (int j = 0; j < this.columns; ++j) {
                this.data[i][j] += m.data[i][j];
            }
        }

        return this;
    }

    /*-----------------------------*/
    public Matrix sub(Matrix m)
    {
        for (int i = 0; i < this.rows; ++i) {
            for (int j = 0; j < this.columns; ++j) {
                this.data[i][j] -= m.data[i][j];
            }
        }

        return this;
    }

    /*-----------------------------*/
    public String toString()
    {
        String out = "";

        for (int i = 0; i < this.rows; ++i) {
            out += "| ";
            for (int j = 0; j < this.columns; ++j) {
                out += String.format("%02d ", this.data[i][j]);
            }
            out += "|\n";
        }

        return out;
    }
}
