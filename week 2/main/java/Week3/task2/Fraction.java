package Week3.task2;
import Week3.task1.*;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){

    }
    //khởi tạo ngay sau thuộc tính
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

/*
    Fraction(int newNumerator, int newDenominator){
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    } 
*/
    
    public Fraction reduce(int numerator, int denominator){
        if (numerator == 0) {
            return null ;
        } else {
            Week3Task1 week3Task1 = new Week3Task1();
            int ucln = week3Task1.gcd(denominator, numerator);
            int d = denominator/ucln;
            int n = numerator/ucln;

            System.out.println(n + "/" + d);
            return new Fraction(n, d);
        }
    }

    // add
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator*other.denominator + other.numerator*this.denominator;
        int newDenominator = this.denominator*other.denominator;
        Fraction sum = reduce(newNumerator, newDenominator);
        return sum;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator*other.denominator - other.numerator*this.denominator;
        int newDenominator = this.denominator*other.denominator;
        Fraction subtract = reduce(newNumerator, newDenominator);
        return subtract;
    }

    // multiple
    public Fraction multiple(Fraction other) {
        int newNumerator = this.numerator*other.numerator;
        int newDenominator = this.denominator*other.denominator;
        Fraction mul = reduce(newNumerator, newDenominator);
        return mul;
        
    }

    //
    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator*other.denominator;
        int newDenominator = other.numerator*this.denominator;
        Fraction div = reduce(newNumerator, newDenominator);
        return div;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if(obj instanceof Fraction){
            //obj có kiểu fraction
            //(Fraction) obj: ép obj về kiểu Fraction
            Fraction other = (Fraction) obj;
            if (other.getDenominator() == other.getDenominator()) {
                //hai phân số bằng nhau
                return true;
            }
            else
            //hai phân số không bằng nhau
                return false;
        }
        else {
            //không phải là Fraction
            return false;
        }
    }

    //get và set phải để public
    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int newNumerator){
        this.numerator = newNumerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int newDenominator){
        this.denominator = newDenominator;
    }
}
