public class Fraction {
    int numerator;
    int denominator;

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
        if (denr == 0)
            throw new IllegalArgumentException("The denominator must not be equal to 0");
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
        if (denominator == 0)
            throw new IllegalArgumentException("The denominator must not be equal to 0");
    }

    /**
     * Calculates GCD of two numbers
     *
     * @param a
     * @param b
     * @return
     */
    private int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a & b);
    }

    /**
     * Reduce the fraction to the lowest form
     */
    private void reduce() {
        int gcd = getGCD(numerator, denominator);
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
}
