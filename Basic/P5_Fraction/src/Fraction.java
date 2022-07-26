import java.util.Scanner;

public class Fraction {
    Integer numerator;
    Integer denominator;

    /**
     * Constructor
     */
    public Fraction() {
        this(0, 1);
    }

    /**
     * Constructor
     *
     * @param number
     */
    public Fraction(int number) {
        this(number, 1);
    }

    /**
     * Constructor
     *
     * @param numr
     * @param denr
     */
    public Fraction(int numr, int denr) {
        if (denr == 0) throw new IllegalArgumentException("The denominator is not equal to 0");
        else if (denr < 0) throw new IllegalArgumentException("The denominator should not be lower than zero");
        this.numerator = numr;
        this.denominator = denr;
        reduce();
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
        if (denominator == 0) throw new IllegalArgumentException("The denominator must not be equal to 0");
    }

    public Double getValue() {
        return (double) numerator / denominator;
    }

    /**
     * Calculates GCD of two numbers
     *
     * @param a
     * @param b
     * @return
     */
    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    private int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Reduce the fraction to the lowest form
     */
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    /**
     * Adds two fractions
     *
     * @param secondFraction
     * @return
     */
    public Fraction add(Fraction secondFraction) {
        int numer = (numerator * secondFraction.getDenominator()) + (secondFraction.getNumerator() * denominator);
        int denr = denominator * secondFraction.getDenominator();
        return new Fraction(numer, denr);
    }

    /**
     * Subtracts two fractions
     *
     * @param secondFraction
     * @return
     */
    public Fraction subtract(Fraction secondFraction) {
        int numer = (numerator * secondFraction.getDenominator()) - (secondFraction.getNumerator() * denominator);
        int denr = denominator * secondFraction.getDenominator();
        return new Fraction(numer, denr);
    }

    /**
     * Multiples two fractions
     *
     * @param secondFraction
     * @return
     */
    public Fraction multiply(Fraction secondFraction) {
        int numer = numerator * secondFraction.getNumerator();
        int denr = denominator * secondFraction.getDenominator();
        return new Fraction(numer, denr);
    }

    /**
     * Divides two fractions
     *
     * @param secondFraction
     * @return
     */
    public Fraction divide(Fraction secondFraction) {
        int numr = numerator * secondFraction.getDenominator();
        int denr = denominator * secondFraction.getNumerator();
        return new Fraction(numr, denr);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    /**
     * Displays console text for inputting data
     */
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer for numerator: ");
        numerator = scanner.nextInt();
        do {
            System.out.print("Enter a non-zero integer for denominator: ");
            denominator = scanner.nextInt();
            if (denominator <= 0)
                System.out.println("Invalid denominator!");
        } while (denominator <= 0);
    }

    /**
     * Displays fraction in a/b format
     */
    public void output() {
        System.out.println(this);
    }

    public boolean equal(Fraction fraction) {
        return Double.compare(getValue(), fraction.getValue()) == 0;
    }

    public boolean equal(int number) {
        return Double.compare(getValue(), (new Fraction(number)).getValue()) == 0;
    }

    public boolean equal(double number) {
        return Double.compare(getValue(), number) == 0;
    }

    public boolean equal(Object obj) {
        if (!(obj instanceof Fraction))
            return false;
        Fraction f = (Fraction) obj;
        return equal(f);
    }

    /**
     * Returns a negative, zero, or positive number, indicating if this object
     * is less than, equal to, or greater than fraction, respectively.
     *
     * @param fraction
     * @return
     */
    public int compareTo(Fraction fraction) {
        if (fraction == null)
            throw new IllegalArgumentException("Null parameter");
        if (signum() != fraction.signum())
            return signum() - fraction.signum();
        if (denominator == fraction.getDenominator())
            return numerator.compareTo(fraction.getNumerator());
        return getValue().compareTo(fraction.getValue());
    }

    public int signum() {
        return (new Double(Math.signum(numerator))).intValue();
    }

    /**
     * Returns an inverse fraction
     *
     * @return
     */
    public Fraction getReciprocal() {
        return new Fraction(denominator, numerator);
    }

    /**
     * Returns a negative fraction
     *
     * @return
     */
    public Fraction getNegative() {
        return new Fraction(-numerator, denominator);
    }

    /**
     * Returns the absolute value of this
     *
     * @return
     */
    public Fraction abs() {
        return numerator < 0 ? new Fraction(-numerator, denominator) : new Fraction(numerator, denominator);
    }

    /**
     * Returns the smaller of two fractions
     *
     * @param fraction
     * @return
     */
    public Fraction min(Fraction fraction) {
        if (fraction == null)
            throw new IllegalArgumentException("Null argument");
        return compareTo(fraction) <= 0 ? this : fraction;
    }

    /**
     * Returns the greater of two fractions
     *
     * @param fraction
     * @return
     */
    public Fraction max(Fraction fraction) {
        if (fraction == null)
            throw new IllegalArgumentException("Null argument");
        return compareTo(fraction) >= 0 ? this : fraction;
    }

    /**
     * Returns a random fraction
     * @return
     */
    public static Fraction getRandom() {
        return new Fraction((int) Math.random());
    }
}
