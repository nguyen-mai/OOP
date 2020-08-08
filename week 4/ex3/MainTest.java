public class MainTest {
    public static void main(String[] args) {
        // Circle c = new Circle(2.1);
        // String c_str = c.toString();
        // System.out.println(c_str);

        // Rectangle r = new Rectangle(2.3, 4.6);
        // String r_str = r.toString();
        // double area = r.getArea();
        // System.out.println(r_str + "có diện tích là: " + area);

        // Square s = new Square(2.0);
        // String s_str = s.toString();
        // double perimeter = s.getPerimeter();
        // double area_s = s.getArea();
        // System.out.println(s_str + " có chu vi là: " + perimeter + " và diện tích là: " + area_s);

        Shape s1 = new Circle(5.5, "RED", false);  
        System.out.println(s1);                    
        System.out.println(s1.getArea());          
        System.out.println(s1.getPerimeter());     
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius()); ERROR

        Circle c1 = (Circle)s1;                   
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); ERROR không khởi tạo trực tiếp đối tượng từ lớp Shape

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); ERROR

        Rectangle r1 = (Rectangle)s3;   
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide()); ERROR

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide()); ERROR
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        // System.out.println(sq1.getSide()); ERROR
        System.out.println(sq1.getLength());
    }
}