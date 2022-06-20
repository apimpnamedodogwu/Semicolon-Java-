package chapterSeven.turtleGraphics;

import java.util.Objects;

public class MyPosition {
    private int row;
    private int column;

    public MyPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean equals(Object input) {
        MyPosition compare = (MyPosition) input;
        return row == compare.getRow() && column == compare.getColumn();
    }

    @Override
    public String toString() {
        return "MyPosition{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
