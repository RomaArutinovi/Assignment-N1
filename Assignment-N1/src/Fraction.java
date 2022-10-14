public class Fraction {

    private int numerator;
    private int denominator;
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void gangamstaili(int n) {
        if (n == 0) {
            return;
        }
        this.numerator *= n;
        this.denominator *= n;
    }

    public void printFraction() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction f2 = (Fraction) obj;
            if (numerator * f2.denominator == denominator * f2.numerator) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static Fraction addition(Fraction f1,Fraction f2){
        return new Fraction(f1.numerator*f2.denominator+f2.numerator*f1.denominator,f1.denominator*f2.denominator);
    }

    public static Fraction subtraction(Fraction f1, Fraction f2){
        return new Fraction(f1.numerator*f2.denominator-f2.numerator*f1.denominator,f1.denominator*f2.denominator);
    }

    public static Fraction multiplication(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator*f2.numerator, f1.denominator*f2.denominator);
    }

    public static Fraction division(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator*f2.denominator, f1.denominator*f2.numerator);
    }
}
