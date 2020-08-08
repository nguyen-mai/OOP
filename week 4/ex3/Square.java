public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSize() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        String s = "Square[side=" + width + ", color=" + color + ", filled=" + filled + "]";
        return s;
    }
}