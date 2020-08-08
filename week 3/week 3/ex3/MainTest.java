public class MainTest {
    public static void main(String[] args) {
        Circle c = new Circle(2.1);
        String c_str = c.toString();
        System.out.println(c_str);

        Rectangle r = new Rectangle(2.3, 4.6);
        String r_str = r.toString();
        double area = r.getArea();
        System.out.println(r_str + "có diện tích là: " + area);

        Square s = new Square(2.0);
        String s_str = s.toString();
        double perimeter = s.getPerimeter();
        double area_s = s.getArea();
        System.out.println(s_str + " có chu vi là: " + perimeter + " và diện tích là: " + area_s);
    }
}