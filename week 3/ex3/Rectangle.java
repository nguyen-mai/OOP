public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        return Math.round(area * 100.0) / 100.0;
    }

    public double getPerimeter() {
        double perimeter = (width + length) * 2;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    public String toString() {
        String s = "[width=" + width + ", length=" + length + "]";
        return s; 
    }
}