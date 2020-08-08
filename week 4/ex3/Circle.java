public class Circle extends Shape {
    final protected double PI = 3.14;
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double Radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = PI * Math.pow(radius, 2);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getPerimeter() {
        double perimeter = 2 * PI * radius;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    public String toString() {
        String s = "Circle[" + "radius=" + radius + ",color=" + color + ", filled=" + filled + "]";
        return s;
    }
}