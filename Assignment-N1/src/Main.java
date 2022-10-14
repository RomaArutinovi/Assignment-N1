public class Main{
    public static void main(String[] args) {

        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(3, 5);

        f1.printFraction();
        f2.printFraction();

        System.out.println(Fraction.multiplication(f1, f2));
        System.out.println(Fraction.division(f1, f2));
        System.out.println(Fraction.addition(f1, f2));
        System.out.println(Fraction.subtraction(f1, f2));
    }
}
