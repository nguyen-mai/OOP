import Week3.task1.Week3Task1;
import Week3.task2.Fraction;
import Week4.Week4;

public class Main {
    public static void main(String[] args) {
        Week3Task1 week3Task1 = new Week3Task1();
        System.out.println("Ước chung lớn nhất là: " + week3Task1.gcd(9, 3));
        System.out.println("Fibo là: " +week3Task1.fibonacci(7));
        week3Task1.sieveEratosthenes(5);
        System.out.println();
        System.out.println("=====================");
        Fraction fraction1 = new Fraction(7, 2);
        Fraction fraction2 = new Fraction(4, 2);
        fraction1.add(fraction2);
        fraction1.subtract(fraction2);
        fraction1.multiple(fraction2);
        fraction1.divide(fraction2);
        Week4 week4 = new Week4();
        System.out.println("Số lớn hơn là: " + week4.max2Int(7, 0));
        int[] myNum = {100, 20, 30, 40};
        System.out.println("Số nhỏ nhất là: " + week4.minArray(myNum));
        System.out.println("Tình trạng: " + week4.calculateBMI(45.0, 1.8));
    }    
}