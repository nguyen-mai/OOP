public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double volume = super.getArea() * height;
        return Math.round(volume * 100.0) / 100.0;
    }

    public String toString() {
        String str;
        str = "Cylinder[" + super.toString() + ",height=" + height + "]";
        return str; 
    }

    public double getArea() {
        double area = 2 * super.getArea() + 2 * PI * radius * height;
        return Math.round(area * 100.0) / 100.0;
    }
}