package org.academiadecodigo.carcrash.field;

public class Position {
    private int row;
    private int col;


    public Position() {
        startPosition();
    }

    public void startPosition() {
        row = (int) (Math.random() * Field.getWidth());
        col = (int) (Math.random() * Field.getHeight());

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
