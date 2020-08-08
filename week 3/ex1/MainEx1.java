import ex1.Circle;
public class MainEx1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Diện tích hình tròn là: " + c.getArea());

        Cylinder cy = new Cylinder(2.1, 7.4, "blue");
        System.out.println("Màu của hình trụ là: " + cy.getColor());
        System.out.println("Thể tích của hình trụ là: " + cy.getVolume());
        System.out.println("Thông tin hình trụ là: " + cy.toString());
    }   
}