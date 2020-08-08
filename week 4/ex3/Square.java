public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSize() {
        return side;
    }

    public void setSide() {
        this.side = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return super.toString();
    }
}